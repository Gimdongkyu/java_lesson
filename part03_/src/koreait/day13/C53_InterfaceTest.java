package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();

// 참조 타입에 따른 메소드 실행(다중 구현체) : z1,z2,z3 이 어떤 메소드 실행 가능한지?
		System.out.println("--------참조 타입에 따른 메소드 실행---------");
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(23);
//		z2.name("쯔위");	// 오류 : InterfaceB 의 추상메소드로 실행 못함.
		
//		z3.methodA();	// 오류 : InterfaceA의 추상메소드로 실행 못함.
//		z3.methodB(23);
		z3.name("쯔위");	
		System.out.println("---------------------------------------");

// 캐스팅: *다중 구현체*의 인테페이스 타입 캐스팅
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		ia.methodB(44);
		
		
// 다형성 구현 예		
		iAmethod(x2);
//		iAmethod(y2);	//오류 ㅣ InterfacceA 구현체가 아님
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
//		iAmethod(z3); 	// 오류: 변수 참조타입이 InterfaceB 
		
		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2);	// 변수 참조 타입이 InterfaceA 이면 오류
		iBmethod(z3);
		
	}
	
	
	// 다형성 구현예 : 메소드 인자 타입인 InterfaceA
	//			interface 구현체는 모두 인자로 전달가능.
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}

	public static void iBmethod(InterfaceB ib) {
	System.out.println(ib.name("momo"));
	
	}
	
	
}
