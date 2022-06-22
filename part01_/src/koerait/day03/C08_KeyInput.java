package koerait.day03;

import java.util.Scanner;

public class C08_KeyInput {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int width;			//사용자가 입력할 값
		int height;		//사용자가 입력할 값
		width = sc.nextInt();
		height = sc.nextInt();
		int box_area = (width * height);
		
		
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
}
}
