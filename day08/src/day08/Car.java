package day08;

public class Car {
	String brand;
	String color;
	int price;
	
	public Car(){}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void drive() {
		System.out.println(brand + ": 일반차 부르릉~");
	}
	void doBreak(Car momcar) { //매개 변수로 Car타입과 Car타입의 자식 객체가 들어올 수 있다.
		if(momcar instanceof SuperCar) { 	//자식 중 Supercar 타입만 허용
			SuperCar mycar = (SuperCar)momcar; // momcar에는 roofopen()이 없기 때문에 다운캐스팅
			mycar.roofOpen();
		}else if(momcar instanceof ToyCar){ // 자식 중 ToyCar 타입만 허용
			ToyCar myToyCar =(ToyCar)momcar; //momcar 에는 charging()이 없기 때문에 다운캐스팅
			myToyCar.charging();
		}
		}
}