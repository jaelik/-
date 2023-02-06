package tr02;

public class BlackModel implements Phone{
	
	private Battery battery;
	
	public BlackModel() {
		this.battery = new Battery();
	}
	
	public BlackModel(Battery battery) {
		super();
		this.battery = new Battery();
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName()+":"+battery.getName());
		
	}
}
