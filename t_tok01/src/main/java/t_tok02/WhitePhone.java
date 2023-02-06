package t_tok02;


//일체형 스마트폰  -배터리가 내장된 폰을 구현 
public class WhitePhone implements Phone{
	
	private Battery battery;
	
	
	public WhitePhone() {
		this.battery = new Battery();
	}



	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + ":" + battery.getName());
	}

}
