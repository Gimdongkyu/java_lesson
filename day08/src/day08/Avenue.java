package day08;

public class Avenue {
public static void main(String[] args) {
	// 주차에는 여러타입의 자동차들이 있다
	// 여러타입의 자동차들을 각각 관리하지 않고, 주차장에 한번에 넣어 관맇도록 한다.

	
	// 부모타입의 객체배열에 여러 자식들의 객체를 담을 수 있다(다향성의 장점)
	Car[] parkinglot = new Car[3];
	parkinglot[0] = new Car ("k9","black", 7000);
    parkinglot[1] = new SuperCar("benz","Red", 30000,"1234"); // 업캐스팅
    parkinglot[2] = new ToyCar("벤츠 NEW GTR" , "white", 150_000);// 업캐스팅
    
    
    //	하나의 부모타입으로 각각 다른 형태의 매소드(오버라이딩) 사용
    for (int i = 0; i < parkinglot.length; i++) {
		parkinglot[i].drive();
		
	}
    
    //[실습문제]
//   캐스팅을 통해 자식팔드에만 존재하는 메소드 자유롭게 사용하기(Car클래스 객체 제외)
// 다운 캐스팅으로 다시 자식필드를 사용가능
    System.out.println("--------다운캐스팅---------");
    SuperCar momcar = (SuperCar)parkinglot[1];
    momcar.roofOpen();
    momcar.roofClose();
    ToyCar dadcar = (ToyCar)parkinglot[2];
    dadcar.charging();
    
    
   System.out.println();
   System.out.println("-------instanceof-----------");
   
   for (int i = 0; i < parkinglot.length; i++) {
	if(parkinglot[i]instanceof SuperCar) {
		System.out.println(parkinglot[i].brand + "는 슈퍼카 입니다");
		parkinglot[i].drive();
	}else if(parkinglot[i] instanceof ToyCar) {
		System.out.println(parkinglot[i].brand +"는 장난감카 입니다");
		parkinglot[i].drive();
	}
}
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    


}
}
