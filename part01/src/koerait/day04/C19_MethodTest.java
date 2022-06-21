package koerait.day04;

public class C19_MethodTest {
// main 메소드: 실행의 시작점. 프로그램 실행을 위해서는 꼭 있어야할 메소드. static	
public static void main(String[] args) {
	
	System.out.println("메소드를 직접 정의해서 사용해봅니다.");
 	System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
 	System.out.println("제어(실행)을 이동합니다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다.");
 	System.out.println("1.");
 	methodA();		// 메소드 호츨(실행)
 
    System.out.println("2.");	
	methodB(11, 33); // 11,33은 메소드 실행에 필요한 인자
	methodB(929, 111);
	
	System.out.println("3.");	
	methodC(929, 12.1);
	methodC(929, 121); // 오류 아님 : 자동캐스트(자동 형변환)
	
	System.out.println("4.");	
	methodD(); // 반환값이 있는 메소드이지만 main 메소드에서 반환값 저장을 안했습니다.
	System.out.println(methodD());		//반환값을 받아서 출력하는 예시.	
	System.out.println("return = " +methodD());
	int temp = methodD();				//반환값을 받아서 변수에 저장하는 예시.
	System.out.println("return = " + temp);

	System.out.println("5.");
	double result = methodE(314, 3.14);
	System.out.println("retuen = " + result);
	;
	System.out.println("5.");
	System.out.println(methodF('i',4)); // methodF 정의 하기

	char ch = 'a';
	int val = 3;
	ch = methodF(ch,val);
	System.out.println("return = " + ch);
}


//static 인 main 에서 실행할 메소드는 동일하게 static이여야 합니다.
	
public static void methodA() {
	System.out.println("##첫번째 메소드 정의 연습니다.");
}
public static void methodB(int a, int b) { // int a , int b 는 인자값을 전달받는 매개변수(지역변수)** 그 블럭 안에서만 사용할 수 있는 변수
System.out.println("##두 번째 메소드 정의 연습입니다.##");
System.out.println("전달받은 값 a = " +a + "b=" + b );
}


public static void methodC(int a, double b) { 
	System.out.println("##세 번째 메소드 정의 연습입니다.##");
	System.out.println("전달받은 값 a = " +a + "b=" + b );
}
public static int methodD() { 		//  반환값이 있는 형식 : 반환값은 int 데이터 , 받드시 return 이 필요합니다.
	System.out.println("##네 번째 메소드 정의 연습입니다.##");
	return 999;
}
public static double methodE(int a , double b) { 		
System.out.println("##다섯번째 메소드 정의 연습니다.##");
return a+b;
}	

public static char methodF( char ch  , int size) { 
	return (char)(ch+size);		//인자로 전달받은 값으로 실행하고 처리결과 리턴
	
}






}
/*String 클래스의 매소드를 이해하기 위해서, 먼저
 * 		                      ㄴ 메소드의 구조연습
 *
 *	메소드의 주요 요소 : 반환값(형식), 인자(argument)또는 매개변수(parameter) , 매소드 이름, public 또는 static 등의 설정	
 *		ㄴ 인자  : 메소드 실행을 위해서 필요한 데이터(형식과 변수명 선언 필요) - 인자의 갯수와 형식은 다양합니다.
 *		ㄴ 반환값 : 메소드 샐행 완려되면 얻어지는 결과값 - 반환 형식은 모든 타입입니다. 반환값이 없으면 void
 *		ㄴ매소드 이름 : 식별자
 *		ㄴ public : 접근한정자, static : 정적 요소
 */

