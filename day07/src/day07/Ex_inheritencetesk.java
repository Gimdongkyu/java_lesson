package day07;

/* 자동차 클래스 선언(부모)
 * brand 와 price 선언
 * 열쇠로 시동켜기 keyOn
 * 열쇠로 시동끄기 keyOff
 * 
 * 슈퍼카 클래스 선언(자식)
 * 열쇠로 시동켜기> 음성으로 시동켜기 로 변경
 * 열쇠로 시동끄기> 음성으로 시동끄기 로 변셩
 * 뚜껑열기(doorOpen), 뚜껑닫기(doorClose)
 * brand 와 price 초기화하기
 */

class Car {
    String brand;
    int price;
    
    Car(){
    	System.out.println("나는 부모 생성자~!");
    }
    
    Car(String brand,int price){
    	
    }
    
    void keyOpen() {
    	System.out.println("철커덕 열쇠로 시동을 킵니다.");
    }

    void keyOff() {
    	System.out.println("철커덕 열쇠로 시동을 끕니다.");
    }
}

class superCar extends Car{
	
	superCar(){}
	
	//생성자
 superCar(String brand, int price){
	 super(brand,price);

 }
	
	 void keyOpen() {
	    	System.out.println("슈퍼커야 시동켜줘");
	    }

	 void keyOff() {
	    	System.out.println("슈퍼카야 시동꺼줘");
	    }

	 void doorOpen() {
		 System.out.println("뚜껑 여는중");
	 }

	 void doorClose() {
		 System.out.println("뚜껑 닫는중");
	 }
}




public class Ex_inheritencetesk {
public static void main(String[] args) {
	superCar mycar = new superCar("bmw",1000);
	mycar.keyOpen();
	mycar.keyOff();
	mycar.doorOpen();
	mycar.doorClose();
}
}
