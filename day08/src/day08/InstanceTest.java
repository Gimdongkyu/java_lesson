package day08;

public class InstanceTest {
	public static void main(String[] args) {
		
	Car c1 = new Car();
	SuperCar su = new SuperCar("페라리","white",20_000,"abcd");
	
	c1.doBreak(su);

	ToyCar to = new ToyCar("타요버스","blue", 300_000);
	c1.doBreak(to);
	
	Car upCar = new SuperCar();
	
	//부모 객체 instanceof 부모클래스: true
    System.out.println(c1 instanceof Car);
    
    //자식객체 instanceof 자식 클래스: true
    System.out.println(su instanceof SuperCar);
	
    //A의 자식객체 instanceof B의 자식클래스: 에
//    System.out.println(to instanceof SupaerCar);
    
    // 자식객체 instanceof 자식클래스: flase
    System.out.println(su instanceof Car);

	// Car upCar = new SuperCar();
    // 업캐스팅객체 instanceof 부모클래스: true
    System.out.println(upCar instanceof Car);
	
	
	
	
	
	
	
	
	
	
	}
}