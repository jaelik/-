package t_tok01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main2(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.setMesseage("hello World"); //class 파일을 직접 수정으로 저장하면서 컴파일이 된다.
		System.out.println(hello.getMesseage());
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		System.out.println(hello.getMesseage());
		
		
	}

}
