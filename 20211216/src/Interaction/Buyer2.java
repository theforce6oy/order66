package Interaction;

public class Buyer2 {
	
	private int money;
	private int bmango;
	
	public Buyer2() {
		
		this.money = 10000;
		this.bmango = 0;
	}
	public void buyerMango2() {
		
		System.out.println("망고구매"+
	                       "\n현재 소지금:"+money+
	                       "\n구매한 망고:"+bmango);
	}
	public void buyMango2(Seller sr) {
		
		this.bmango = sr.getMango();
		this.money = money-sr.getMango()*sr.getPrice();
		if(this.bmango <= sr.getMango()) {
			System.out.println("망고품절");
		return;
		}
		System.out.println("망고"+sr.getMango()+"개 구매");
		System.out.println("남은금액은 "+money+"입니다.");
	}
	
	public int getMoney2() {
		return money;
	}

	public void setMoney2(int money) {
		this.money = money;
	}

	public int getBmango2() {
		return bmango;
	}

	public void setBmango2(int uMango) {
		this.bmango = uMango;
	}
	
	}
