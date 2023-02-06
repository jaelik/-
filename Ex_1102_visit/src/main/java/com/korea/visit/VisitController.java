package com.korea.visit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import dao.VisitDAO;
import util.MyCommon;
import vo.VisitVO;

@Controller
public class VisitController {
	
	VisitDAO visit_dao;
	
	@Autowired
	ServletContext application;
	
	@Autowired 
	HttpServletRequest request;
	
	
	public void setVisit_dao(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	}
	
	@RequestMapping(value= {"/","list.do"})
	public String list(Model model) {
		List<VisitVO> list = visit_dao.selectList();
		
		model.addAttribute("list", list);
		return MyCommon.VIEW_PATH+"visit_list.jsp";
	}
	
	//글쓰기 페이지로 이동 
	@RequestMapping("insert_form.do")
	public String insert_form() {
		
		return MyCommon.VIEW_PATH+"insert_form.jsp";
	}
	//새글 작성 
	@RequestMapping("/insert.do")
	public String insert(VisitVO vo) {//낱개로 또는 객체로 받을 지 선택
		//insert.do?name=aaaaa&content=내용&pwd=1111 
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		String webPath = "/resources/upload/";
		String savePath = application.getRealPath(webPath);
		System.out.println(savePath);
		
		//업로드된 파일의 정보 
		MultipartFile photo =vo.getPhoto();
		String filename="no_file";
		//업로드된 파일이 존재 한다면 
		if(!photo.isEmpty()) {
			filename = photo.getOriginalFilename();
			
			File saveFile = new File(savePath,filename);
			if(!saveFile.exists()) {
				saveFile.mkdirs();
			}else {
				//동일 파일명 방지 
				long time = System.currentTimeMillis();
				filename= String.format("%d_%s", time,filename);
				saveFile = new File(savePath,filename);
			}
			
			//업로드를 위한 실제 파일을 물리적으로 기록 
			try {
				photo.transferTo(saveFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		vo.setFilename(filename);//vo에 묶어서 같이 전달하기 
		
		int res = visit_dao.insert(vo);
		
		//sendRedirect("list.do")
		return "redirect:list.do";
	}
	
	//게시글 삭제 
	@RequestMapping("/delete.do")
	@ResponseBody // return 값을 view 형태로 인식하지 않고 콜백 메서드로 전달하기 위한 어노테이션 
	public String delete(int idx,String pwd) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();  //리턴값이 다른 두개를 다받을수있는 object 
		map.put("idx", idx);
		map.put("pwd", pwd);
		
		int res = visit_dao.delete(map);
		
		String result = "no";
		
		if(res == 1) {
			result ="yes";
		}
		
		String finRes= String.format("[{'res':'%s'}]",result);
		
		return finRes; //"[{'res':'%s'}]" 이렇게 이름이 지어진 jsp 가 있다고 생각을 하기에 위에 어노테이션 진행 
		
	}
	@RequestMapping("/modify_form.do")
	public String modify_form(Model model,int idx) {
		//파라미터로 넘어온 idx를 dao로 보낸다.
		VisitVO vo = visit_dao.selectOne(idx);
		//바인딩
		model.addAttribute("vo",vo);
	
		return MyCommon.VIEW_PATH+"modify_form.jsp";
	}
	@RequestMapping("/modify.do")
	public String modify(VisitVO vo) {
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		int res = visit_dao.update(vo);
		
		return "redirect:list.do";
		
	}
	
}
