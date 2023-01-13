package com.greedy.trying.coffee;


public class cafe {
	/* 캐셔 */
	/* 1. 주문을 받습니다.
	 * 2. 바리스타한테 커피제조를 부탁한다.
	 * 3. 바리스타한테 커피를 받는다.
	 * 4. 손님에게 커피를 준다.
	 * */
//	private customer customer = new customer();
	baristar baristar = new baristar();
	public void ordermenu() {
		
	}
	public boolean comeorder(String coffee){
//		customer.come();
		System.out.println("커피를 주문 받았습니다.");
		if(baristar.fxorder(coffee)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void coffeecookplz() {
	
		
		
	}
	
	public void coffeegetto() {
		
	}
	
	public void custgive() {
		
	}
		
}
