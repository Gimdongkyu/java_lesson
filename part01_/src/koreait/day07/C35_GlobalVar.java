package koreait.day07;

public class C35_GlobalVar {
/*
 * [변수가 선언된 위치로 구분]
 * 지역변수(local variable): 메소드 , for, if, while 등등 {} 에서 선언된 변수. 블록을 벗어나면 변수사용 못함
 * 전역변수(global variable): 클래스{} 에서 선언된 변수
 * 
 * [전역변수를 static 여부로 구분]
 * 클래스이름.변수명
 * 객체를 만들어서 사용하는 this.변수명 (이때는 인스턴스 변수)
 * 
 * 전역변수는 클래스 또는 객체의 특성을 나타낼때 필드(또는 프로퍼티)라고 부릅니다. field property
 */
int count;		//전역변수	
String message;	
static int num;
static double point;
static final int TEST = 9999; //static final 이 상수 선언할때 초기화 하지 않으면 오류


public static void main(String[] args) { // static 은 static 만 접근합니다.**

int num = 10;//main 메소드에서만 사용
	
	System.out.println("num=" + num);		//10
//	System.out.println("message=" + message); // 오류: static이 아닌 변수는 사용 못 함
	methodB();
//	methodA();	//오류 static이 아닌 매소드
	
	
	
	
	
	
	
	}
public  void methodA() {	// static메소드가 아니므로 객체를 만들어서 사용하는 메소드
	int num = 99;
	System.out.println("num=" + num);
	System.out.println("message=" + message);		//전역변수로 선언된 message
}
	//중요***
	public void methodC(int count) {
		this.count = count;	//this 는 new 로 만들어진 객체. methodC메소드를 실행시키는 객체
	}

public static void methodB() {
	int num = 77;
	//지역변수와 전역변수 이름이 같은 경우. 지역변수를 가져옵니다.
	System.out.println("num=" + num);
	System.out.println("num=" + C35_GlobalVar.num); //Integeer.BYTS 와 같은형태.
	//전역변수로 선언된 num. static 일때는 클래스이름.변수명 이고 static이 아닐떄는 this.변수명
}

}
