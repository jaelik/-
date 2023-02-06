package service;

import java.util.List;

import dao.BoardDAOImpl;

public class BoardServiceImpl implements BoardService{

	BoardDAOImpl dao;
	
	public BoardServiceImpl() {
		
	}
	
	public BoardServiceImpl(BoardDAOImpl dao) {
		//외부에서 들어온 doa 를 생성자인젝션을 통해 받아줄 예정입니다.
		this.dao= dao;
		
	}
	@Override
	public List selectList() {
		
		//과일 목록이 들어있는 리스트를 반환 해준다.
		return dao.selectList();
	}

}
