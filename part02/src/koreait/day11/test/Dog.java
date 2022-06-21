package koreait.day11.test;

public class Dog extends Animal {

	protected int legs;

	public Dog() {
		System.out.println("새로운 동물가족은 dog");
		type=Animal.DOG;
	}
	@Override
	public void act() {
		System.out.println("Dog : 하루에 두 번 산책하기");
	}
	
	@Override
	public String eat(Object object) {
		
		return "먹이는" + object + "입니다.";
	}
	
	public  void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}

	
}
