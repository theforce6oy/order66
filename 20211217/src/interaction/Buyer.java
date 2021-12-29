package interaction;

public class Buyer {
	
		private int money;
		private int mango;
		private int melon;
		
		public Buyer(int money) {
			this.money = money;
			this.mango = 0;
			this.melon = 0;
		}
		
		public void buyMango(Seller sl, int mango) {
			if((mango*4000) > this.money) {
				System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
				return; }
			if(sl.getMango() < mango) {
				System.out.println("재고가 부족합니다. 망고 재고 : " + sl.getMango());
				return;
			}
			
			this.money -= mango * 4000;
			this.mango += mango;
			
			sl.sellMango(mango);
		}
		
		public void buyMelon(Seller sl, int melon) {
			if((melon*6000) > this.money) {
				System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
				return; }
			if(sl.getMelon() < melon) {
				System.out.println("재고가 부족합니다. 멜론 재고 : " + sl.getMelon());
				return;
			}
			this.money -= melon * 6000;
			this.melon += melon;
			
			sl.sellMelon(melon);
		}

		public int getMango() {
			return mango;
		}

		public void setMango(int mango) {
			this.mango = mango;
		}

		public int getMelon() {
			return melon;
		}

		public void setMelon(int melon) {
			this.melon = melon;
		}
		public void showBuyer() {
			System.out.println("----------구매자 정보----------");
			System.out.println("소지중인 망고개수 : " + mango + ", 잔여금액 : " + money);
			System.out.println("-----------------------------");
		}
}
