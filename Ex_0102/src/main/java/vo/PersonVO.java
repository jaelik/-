package vo;

public class PersonVO {

	
	private String name;
	private int age;
	
	
	public PersonVO() {
		System.out.println("---PersonVO의 생성자 호출 ----");
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
