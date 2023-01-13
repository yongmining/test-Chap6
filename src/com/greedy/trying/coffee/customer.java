package com.greedy.trying.coffee;

import java.util.Scanner;

public class customer {
//	private boolean isorder;
//	boolean iscome = true;
//	boolean cooking = true;
	
	cafe cafe = new cafe();
	Scanner sc= new Scanner(System.in);
	public void menu() {
		
	}
	
	public void come() {
		System.out.println("주문 받아주세요.");
		if(cafe.comeorder(sc.nextLine())) {
			System.out.println("커피를 받았습니다.");
		}
//		if(isorder) {
//			System.out.println("손님이 왔습니다.");
//		}else {
//			System.out.println("주문하지 않았습니다. 먼저 주문해주세요.");
//			ordercoffee();
//		}
	}
	
	public void ordercoffee() {
//
//		if(isorder) {
//			System.out.println("손님이 이미 주문한 상태입니다.");
//			isorder = true;
//		}else {
//			this.isorder=true;
//			System.out.println("손님이 왔습니다. 주문 받아주세요.");
//		}
	}
	
	public void getcoffee() {
//		System.out.println("커피 감사합니다~");
		
		
	}
	public void goout() {
//		iscome = true;
//		if(isorder) {
//			if(iscome = false) {
//				System.out.println("주문한 상태입니다. 커피를 받고 가주세요.");
//					
//			}else {
//				isorder = false;
//				System.out.println("주문을 아직 하지않았습니다. 주문해주세요.");
//			}
//		}else {
//			System.out.println("안녕히 계세요");
//		}
//		
		
	}
}
