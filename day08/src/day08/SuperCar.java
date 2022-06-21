package day08;

public class SuperCar extends Car{
		String pw;
	
	public SuperCar() {}

	// 생성자 초기화 단축키: alt + shift + s > o
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	@Override
	void drive() {
		System.out.println(brand + ": 슈퍼카 부아앙!!");
	}
	
	void roofOpen() {
		System.out.println(brand + ": 뚜껑 열리는 중...");
	}
	
	void roofClose() {
		System.out.println(brand + "처커덕...(뚜껑닫힘)");
	}
	
}