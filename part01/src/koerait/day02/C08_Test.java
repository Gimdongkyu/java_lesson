package koerait.day02;

public class C08_Test {
public static void main(String[] args) {

int width = 23;			//사용자가 입력할 값
int height = 19;		//사용자가 입력할 값
int box_area = width * height;

System.out.println("[[사각형 도형의 넓이 구하기]]");	
System.out.println("가로 : "+ width + "㎠");	
System.out.println("세로 : "+ height + "cm" );	
System.out.println("넓이를 구했습니다: " + box_area);	
System.out.println();	


System.out.println("[[원 도형의 넓이와 둘레 구하기]]");	
final double PI = 3.14;
double half = 23.230;	
double round = 2*3.14*half;
double circle_area = 3.14*half*half;

System.out.printf("반지름 : %.3f\n",half);
System.out.printf("둘래를 구했습니다 : %.3f\n",round);
System.out.printf("넓이를 구했습니다 : %.3f\n",circle_area);



// final 테스트
// 		 변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못합니다.

	final int test = 123;		//값을 변경 못하는 상수입니다.
	System.out.println("test = " + test);
	
//	test = 456;  //오류 : final로 선언됨.

}
}
//둘레 공식 = 2*3.14*반지름
//넓이 공식 = 3.14 * 반지름 * 반지름
