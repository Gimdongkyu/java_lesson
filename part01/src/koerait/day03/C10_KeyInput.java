package koerait.day03;

import java.util.Scanner;

public class C10_KeyInput {
public static void main(String[] args) {
	// sc는 변수명입니다. 기본형 변수가 아닌 클래스 타입의 변수입니다. -> 참조형 변수
	// ㄴ new 연산으로 만드는 객체의 클래스 이름과 같은 이름으로 변수 선언 합니다.
	Scanner sc = new Scanner(System.in);	    //키보드 입력을 위한 변수 선언.
	
	int data;
	System.out.print("정수값 일렵하세요. ->"); // 입력안내 메세지
	data = sc.nextInt(); // 사용자로부터 키보드 입력받고 그 값을 정수로 변환하여 data변수에 저장.

	//사용자가 숫자만 입력하지 않았을때는 정수로 변환하지 못하고 오류 발생시킵니다.
	
	System.out.println("입력된 값은" + data +"입니다.");
	
	
	double point;
	System.out.println("실수값 입력하세요 -> ");
	point = sc.nextDouble();
	System.out.println("압력된 값은 " + point + "입니다.");
	
	
	
	
	
}
}
/*
 * 	표준 출력 : System.out(out음 System 클래스의 정적인 필드이고 메소드 println()은 갖습니다.)
 * 	표준 입력 : System.in	 -> in은 System 클래스의 정적인 필드
 *     					 -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 * 						 -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	
 * 				*참고 : 기본패키지 java.lang은 import 없이 사용합니다.
 * 
 * *참고 import 단축키는 command + shift+ o
 */