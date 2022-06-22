package koreait.day07;

public class C36_C35Test {
//C35 클래스를 1)객체로 만들어서 2)static인 것들 테스트합니다.
// (참고:main메소드를 갖고있는 클래스를 객체로 만들지 않는것이 일반적입니다.)
	
	public static void main(String[] args) {
	
		//test1, test2는 참조형 변수
	C35_GlobalVar test1 = new C35_GlobalVar();		//c35클래스 타입의 객체생성
	C35_GlobalVar test2 = new C35_GlobalVar();		//c35클래스 타입의 객체생성
		
	//C35클래스에서 static 이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장합니다.- 객체마다 각각 다른 특성을 나타냅니다.
			test1.count = 10;
			test2.count = 20;
		

			test1.message ="hi test1";
			test2.message ="hello test2";
			
			test1.methodA();		//인스턴스 메소드
			test2.methodA();
	
			test1.methodC(123);		//this.count 에서 this는 test1
			test2.methodC(999);		//this.count 에서 this는 test2	
	
			System.out.println("test1.count = " +test1.count);
			System.out.println("test2.count = " +test2.count);
			
			//static 요소 테스트: static변수 또는 메소드는 클래스 이름으로 사용.
			C35_GlobalVar.num = 101;
			System.out.println("static num =" + C35_GlobalVar.num);
			System.out.println("static num =" + test1.num);		//경고: static방법을 사용해라.
			System.out.println("static num =" + test2.num);
			
			// static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙 영역)은 다릅니다.

			//상수 TEST 확인
			System.out.println("TEST = " + C35_GlobalVar.TEST);
		//	C35_GlobalVar.TEST = 100;	//오류 : final은 값 변경 못합니다.
			
			C35_GlobalVar test3 = new C35_GlobalVar();
			//전역 변수의 기본 초기값? - 0, 0.0, 참조타입은 null
			//참고 : 지역변수의 기본 초기값? - 배열일때만 0, 0.0, 참조타입은 null, 그리고 나머지는 오류
			System.out.println("test3.count = " + test3.count);		//0
			System.out.println("test3.count = " + test3.message);	//null
			System.out.println("test3.count = " +  C35_GlobalVar.point); // 0.0
	}
	




}
