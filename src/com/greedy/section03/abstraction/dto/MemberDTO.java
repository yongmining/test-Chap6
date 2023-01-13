package com.greedy.section03.abstraction.dto;

public class MemberDTO {
	
	
	
	private int number;				//회원번호
	private String name;			//회원명
	private int age;				//나이
	private char gender;			//성별
	private double height;			//키
	private double weight;			//몸무게
	private boolean isActivated;	//회원타퇴여부(활성화여부)

//	public MemberDTO() {}

	/* 설정자(setter) / 접근자(getter)*/
	
	/* 설정자(setter) 작성 규칙
	 * : 필드 값을 변경할 목적의 매개변수를 변경하라는 필드와 같은 자료형으로 선언하고
	 * 호술 시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
	 * 
	 * [표현식]
	 * public void set 필드명(매개변수){
	 * 		필드 = 매개변수;
	 * }
	 * 
	 * [작성예시]
	 * public void setName(String name){
	 * 		this.name = name ;
	 * }
	 * 
	 * 접근자(getter) 작성규칙
	 * : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
	 * 	 각 접근자는 하나의 필드에만 접근하도록 한다.
	 *   필드에 접근해서 기록된 값을 return을 이용하여 변환하며,
	 *   이 때 메소드의 반환타입은 반환하려는 값을 자료형과 일치시킨다.
	 *   
	 * [표현식]
	 * public 반환형 get필드명(){
	 * 		return 반환값;
	 * }
	 * 
	 * [작성예시]
	 * public String getName(){
	 * 		return this.name;
	 * }
	 * */
	
	/* 설정자 (setter) */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/* boolean 형의 경우 is는 생략하고 작성한다. */
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	
	/* 접근자(getter)메소드 */
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}

	/* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례이다.
	 * is로 시작하는 경우 필드의 is는 생략한다.
	 * 문법상 has가 적합할 경우 has를 사용할 수 있ㄷ.
	 * */
	public boolean isAcitivated() {
		return isActivated;
	}
}	