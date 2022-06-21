package day08;

public class practiceRoad {
	public static void main(String[] args) {
		// SuperCar(String brand, String color, int price, String pw)
		SuperCar mycar = new SuperCar("Ferrari", "White", 36_000, "abcd");
		Car momcar = mycar;
		momcar.drive();	// 업캐스팅을 할 경우 오버라이딩 된 메소드 사용가능
//		momcar.roofOpen();	// Car 에 없는 기능 사용 불가
		
		// 자식 타입 참조변수로 부모객체를 가르킬 수 없다!
		// 실제 객체의 인스턴스 맴버갯수를 넘을 수 없기 때문이다.
//		SuperCar firstCar= new Car();	//에러
		
		// 다운캐스팅
		SuperCar mycar2 = (SuperCar)momcar;
		mycar2.roofOpen();
		mycar2.roofClose();
		
		//업캐스팅 안된 부모객체를 자식으로 형변환?
//	SuperCar supercar = (SuperCar)new Car(); // 컴파일러는 형변환 맞춰줬니까 ok
//		supercar.roofClose(); // 실행시 ClassCastException
		
		// 객체에 null을 넣었을 경우 캐스팅 실수
//		SuperCar supercar = null;
//		Car car = supercar;
//		car.drive();  	//실행시 NullpointerException
		
		
		
	}
}