package t_tok4;

import org.springframework.context.support.GenericXmlApplicationContext;
//라이프 사이클 사용 
public class Main {
	public static void main(String[] args) {
		//스프링 컨테이너 생성 
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		
		
		//스프링 컨테이너 설정 
		context.load("beans.xml");
		context.refresh();
		//!!이방법으로 진행시 refresh()를 안할시 에러가 진행됨  !!
		
		//스프링 컨테이너 사용  <bean>을 사용한다는 부분 
		//bean도 역시 라이프 사이클을 관리 한다  *어플리케이션 구현시 적당한 방법은 사용 *
		//1.인터페이스 구현시 
		//2.bean 정의 시 메소드 지정 하는 방법
		//3.어노테이션 지정시 
		Student student = (Student) context.getBean("student");
		System.out.println(student.getName());
		
		
		
		//스프링 컨테이너 종료 
		context.close();
		
		
	}
}
