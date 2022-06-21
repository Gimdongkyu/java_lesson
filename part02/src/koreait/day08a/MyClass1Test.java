package koreait.day08a;

import koreait.day08.MyClass;
import koreait.day08.Score;

public class MyClass1Test {
public static void main(String[] args) {
	
	//MyClass1 객체생성
	MyClass my = new MyClass();	// public 클래스 이지만 import 필요.

	//MyClass1 클래스의 필드 중 사용할 수 있는 것은? 답 : point
	//			defulat(package) 한정자 필드 name, 메소드 getAge,setAge 사용못함.
	//my.name = "momo"; 
	my.point = 1.234;
	//my.age = 23;  오류 private 한정자 필드
	//my.setAge(23);	
	//System.out.println("age = " + my.age); 오류 private 한정자 필드
	//System.out.println("age = " + my.getAge()); 
	//my.setAge(-100);
	//System.out.println("age = " + my.getAge()); // private 필드갑 읽어오는 메소드
	System.out.println("point = " + my.point); // public 한정자 필드
	//System.out.println("name = " + my.name); // package 한정자 필드
	
	//Score 클래스 필드, 메소드의 한정자가 모두 default 입니다.
	//		ㄴ new 객체생성은 될까요? 답: Class는 public 한정자이므로 생성됩니다.
	
	Score score = new Score();
	
}
}
