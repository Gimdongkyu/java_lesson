package koerait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
public static void main(String[] args) {
String best;			//	특기과목명 참조할 변수
int Korean;
int English;
int science;
double aver;
int total;
int max;
Scanner sc = new Scanner(System.in);

System.out.println("[[성적 집계: 평군과 총점 구하기]]");
System.out.println("성적을 입력하세요");

System.out.println("국어 ---> ");
Korean = sc.nextInt();

System.out.println("영어 ----> ");
English = sc.nextInt();

System.out.println("과학 ----> ");
science = sc.nextInt();

total = Korean+English+science ;
aver = total/3;

System.out.println("국어점수입니다 : " + Korean);
System.out.println("영어점수입니다. : " + English);
System.out.println("과합점수입니다 : " + science);

System.out.println(">>처리되었습니다.");
System.out.println("총점 : " + total);
System.out.printf("평균 : %d(%% %.3f), 과목수 : %d\n",total/3,aver,3 );

if(Korean>English) {
	max = Korean;
	best = "국어";
} else {
	max = English;
	best = "영어";
}

if(max<science) 
	max = science;
	best = "과학";

	System.out.printf("이 학생의 특기과목은 %s 입니다.", best);

}
}
