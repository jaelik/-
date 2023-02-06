package dao;

import java.util.List;

public interface BoardDAO {

	//DAO의 역할 : 기본적으로 CRUD 기능을 갖고있다.
	//나중에 사용할 추상메서드를 만든다   ,파라미터를 받을수도 있긴 한데  무엇을 받을지 모를떄는 모든것을 받을수있는 Object 타입으로 만들자.
	int insert(Object ob);
	List<Object> selectList();
	int update(Object ob);
	int delete(int idx);
	
}
