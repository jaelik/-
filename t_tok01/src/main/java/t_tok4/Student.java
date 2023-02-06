package t_tok4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{  
	//imple 된 두가지 
	//InitializingBean 초기화 bean
	//DisposableBean 소멸을 담당하는 bean 
	
	// private로 변수명을 선언하고  getter setter를 사용하는것이 캡슐화라 한다.
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}
	//어노테이션으로 라이프 사이클 관리 방법 (다른프레임워크에서도 사용가능 )스프링에서 종속 되지 않음  ,첫번쨰로 실행됨
	//beans.xml에서 xml란에  추가적인 설정을 해야합니다 
	//초기화 메소드 
	@PostConstruct
	public void postConstruct() {
		if("스프링".equals(name)) { //스프링 equals 진행시 이렇게 equals를 사용해야 올바른 문법 
			System.out.println(name + "은 정말 열심히 하네요");
		}else {
			System.out.println(name + "은 몇살인가요?");
		}
	}
	//소멸 메소드 
	@PreDestroy
	public void preDestroy() {
		if("스프링".equals(name)) {
			System.out.println("감사합니다. 열심히 하겠습니다.");
		}else {
			System.out.println("나이는 비밀입니다.");
		}
	}
	
	//Bean으로  메소드 정의 방법 (내가 메소드 이름을 지정해서 사용가능) 스프링에서만 종속  세번쨰로 실행됨 
	//초기화 메소드 
	public void init() {
		System.out.println(name + "은 학생인가요?");
	}
	//소멸 메소드 
	public void clean() {
		System.out.println(name + "은 학생이 아니였습니다");
	}
	
	//인터페이스 임포트 하여 구현 방법  (지정되어있는 이름으로만 사용가능)스프링에서만 종속   두번째로 실행됨
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean이 소멸될 때 호출됩니다. 자원을 반납할 부분이 있다면 여기서 진행하면 됩니다.");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean이 생성될 때 호출됩니다. Bean생성과 DI 이후에 초기화 부분이 존재한다면 여기서 진행하면 됩니다.");
	}
	
	

}
