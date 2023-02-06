package t_tok03;


//target : 실제 비즈니스 로직을 처리하는 클래스 
public class ItemTarget {
	//아이템 조회 
	public void selectItem() {
		System.out.println("아이템을 조회합니다.");
	}
	
	//아이템 구매 
	public void buyItem() {
		System.out.println("아이템을 구매 합니다 .");
	}
	
	//아이템을 대량 구매 
	public void buyItems() {
		System.out.println("아이템을 대량으로 구매합니다.");
	}
}
