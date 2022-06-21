package koreait.day11.test;

public class Crow extends Animal { // 까마귀
	
	protected int wings; // 디폴트 한정자 + 다른패키지 자식클래스
	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type= Animal.CROW;
	}
	
	@Override
	public void act() {
		System.out.println("Crow : 하루종일 날아다니기");
		
	}
	
	@Override
		public String eat(Object object) {
			return "먹이는 개구리 " + object + "마리 입니다.";
		}
	
	
	public void fly() {
		setName("까마귀");
		setColor("검정");
		System.out.println("특징 : 날기");
	}

	
	
}
