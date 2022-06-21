package day07;

class Monkey{
	String name;
	int age;

	// 생성자 단축키 alt + Shift + s + o
	Monkey(String name, int age){
		this.name = name;
		this.age = age;
	}
		
Monkey(){}

	
	
	
	
	void walk() {
			System.out.println("두발 또는 네발로 걷기");
	}
	void eat() {
		System.out.println("바나나 먹기 냠냠");
	}
	
	// 오버로딩: 매개변수의 갯수와 타입이 다르다.
	void eat(String food) {
		System.out.println(food + "먹는중");
	}
	
	void eat(int foodCnt) {
		System.out.println(foodCnt+"인분 바나나 먹기");
	}

}

class Human extends Monkey{
	int money;
	String job;
	
	@Override
	void walk() {
		System.out.println("두 발로 걷기");
	}
	@Override
	void eat() {
		System.out.println("밥 먹기 쿰척");
	}
	// 오버로딩: 매개변수 타입 또는 매개변수 갯수가 다르다.
	void wlak(String place) {
		System.out.println(place + "걷기");
		
	}
	/* 리턴타입은 오버로딩이 성립되지 않는다.
	String wlak(String place) {
		System.out.println(place + "걷기");
		return place;
	}
	*/
	//메소드 선
	void sleep() {
		System.out.println("자는중...zzz");
	}
	
	
}





public class Ex_overloading_overriding {
	public static void main(String[] args) {
		Monkey mk = new Monkey();
		mk.eat();
		mk.eat("바나나");
		mk.eat(100);

	Human man = new Human();
	man.eat();		// 오버 라이딩
	man.eat("치킨"); // 부모클래스의 메소드
	man.walk();		//오버 라이딩
	man.wlak("한강 공원");	// 오버로딩		
	
	}

}

















