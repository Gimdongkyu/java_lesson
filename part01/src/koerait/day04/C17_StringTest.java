package koerait.day04;

public class C17_StringTest {

	public static void main(String[] args) {
	
	String name = "kim";		//참조형 변수
	String name2 = "kim";
	String name3 = "lee";
	String name4 = new String("kim");	//새로운 스트링 객체 생성
	
	
	System.out.println("name == name 2 참조위치 ?" + (name == name2)); //true
	System.out.println("name == name 4 참조위치 ?" + (name == name4)); //false
	System.out.println("name2 == name 4 참조위치 ?" + (name2 == name4));//false
	
	name2 = "son";
	System.out.println("name == name 2 참조위치 ?" + (name == name2)); //true
	
	System.out.println("name =" + name);	
	System.out.println("name2 = " + name2);	
	System.out.printf("name3 = %s\n" , name3);	
	System.out.printf("name4 = %s\n" , name4);	
	
	
	
	
	
}
}
/*
 * 	문자열 : 기호 " " 를 사용하는 문자열입니다.
 * 			자바에서느 기본형 데이터 아니고 String 클래스 타입으로 사용합니다.
 * 									ㄴ 필드, 메소드 이용하여 문자열 기능 사용
 * 
*/
