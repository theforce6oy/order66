package interaction;

public class Seller {
	
	private int money;
	private int mango;
	private int melon;
	
	public Seller(int mango, int melon) {
		this.money = 0;
		this.mango = mango;
		this.melon = melon;
	}

	public void sellMango(int mango) {

		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 재고 : " + this.mango);
			return; }
		this.mango -= mango;
		this.money += mango * 4000;
	}
	
	public void sellMelon(int melon) {

		if(this.melon < melon) {
			System.out.println("멜론이 모자랍니다. 재고 : " + this.melon);
			return; }
		this.melon -= melon;
		this.money += melon * 6000;
	}
	
	
	public void showSeller() {
		System.out.println("셀러 정보");
		System.out.println("현재소지금 : " + this.money);
		System.out.println("현재 망고 재고 : " + this.mango);
		System.out.println("현재 멜론 재고 : " + this.melon);
		System.out.println("--------------------");
	}
	
	public int getMango() {
		return this.mango;
	}
	public int getMelon() {
		return this.melon;
	}
}

