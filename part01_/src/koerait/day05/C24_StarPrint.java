package koerait.day05;

import java.util.Scanner;

public class C24_StarPrint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	System.out.println("[[영화감상 후기]]");
	System.out.println("평점을 몇 점 주시겠습니까? (1~5) >>>");
	int count = sc.nextInt();

		System.out.println("방법1");
		for(int i=0;i<count;i++)			
		
		System.out.print("★");
		
		System.out.println("\n\n방법2");
		for(int i=0;i<count;i++)			
			System.out.print("★");
		
		for(int i=0;i<5-count;i++)			
		System.out.print("☆");		//출력횟수는 5-count
		
		
		System.out.println("\n\n방법2_");


		for(int i=0;i<5;i++)			
		if(i<count)	
			System.out.print("★");
		else		
			System.out.print("☆");		//출력횟수는 5-count
		

		System.out.println("\n\n방법2__");
		int k ;		//loop counter 변수가 main 메소드의 지역변수
		for(k =0;k<count;k++)		
			System.out.print("★");
		
		//System.out.print("k = " + k); // k=3 , 위츼 for문이 종료가되는 k 값
		for(;k<5;k++)					// k의 값은 얼마무터 시작하는 걸까요. k는 count부터
			System.out.print("☆");




}
}
