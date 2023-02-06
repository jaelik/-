package com.korea.upload;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import vo.PhotoVO;

@Controller
public class FileUploadController {
	
	static final String VIEW_PATH="/WEB-INF/views/";
	
	@RequestMapping(value= {"/","/insert_form.do"})
	public String insert_form() {
		return VIEW_PATH + "insert_form.jsp";
	}
	
	//파일업로드
	@RequestMapping("/upload.do")
	public String upload(PhotoVO vo) {
		
		String savePath = "c:/myupload";
		
		//업로드된 파일 정보가져오기
		MultipartFile photo = vo.getPhoto();
		String filename = "no_file";
		
		if(!photo.isEmpty()) {
			
			//업로드될 실제 파일명 
			filename = photo.getOriginalFilename();
			
			//파일을 저장할 경로 확인 
			File saveFile = new File(savePath,filename);
			//savePath 경로 까지 가서 filename이 있나 확인 
			//없으면 만들어
			
			if(!saveFile.exists()) {
				saveFile.mkdirs();//폴더생성 
			}
			//실제로 파일을 업로드 하는 코드 
			//물리적으로 파일을 업로드 하는코드 
			
			
		}
		
		return VIEW_PATH +"input_result.jsp";
	}
	
	
}


