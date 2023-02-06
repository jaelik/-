package tr01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	/*
	 * public static void main(String[] args) { HelloWorld helloworld = new
	 * HelloWorld(); helloworld.setMsg("생성자를 통한 hello world");
	 * System.out.println(helloworld.getMsg()); }
	 */	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloworld2");
		System.out.println(hello.getMsg());
	}

}
