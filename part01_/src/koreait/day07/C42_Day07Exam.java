package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	//작성자 김동규
public static void main(String[] args) {
	
	/*	- koreait.sec2020@gmail.com 월요일까지
	 * 1. 덧셈 문제는 두자리 덧셈입니다.
	 * 2.문제는 난수로 만듭니다.
	 * 3. 테스트 할때는 문제를 5개로 줄여서 하세요.
	 * 4. 클래스 활용아니고 int 형 배열로만 하세요.
	 * 5. 처번째 피연산자 배열
	 * 	  두번쩨 피연산자 베열
	 * 위의 2개 배열에 저장하는 내용이 아래 1)2) 와 같을때 각각에 대해 추가적으로 필요한 배열은
	 * 모든문제 10개를 저장? 사용자가 입력한 답 저장 배열이 필요하고
	 * or
	 * 틀린문제만 저장? 틀린문제 번호를 저장하는 배열이 필요합니다.
	 * 	
	 * 첫 번째 피연산자 : 83,56,71,45, .....	난수	배열에 각각 저장하기
	 * 두 번째 피연산자 : 50,12,19,52, .....  	난수
	 *  사용자가 입력한 답 저장하기 배열 
	 *  답을 맞추었나?	83+50(예시) == 사용자가 입력한 답	
	 *  	틀렸나?
	 *  틀린 문제 정답 출력: 83+50(예시) != 사용자가 입력한 답	
	 */
int k = 10;
int right  = 0; 
int [] ex1 = new int[k];		
int [] ex2 = new int[k];
int [] ans = new int[k];
Random r = new Random();
Scanner sc = new Scanner(System.in);
System.out.println("------------------------------");
System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
System.out.println("------------------------------");
System.out.println("시작합니다.");

	for(int i=0;i<k;i++) {
		ex1[i] = r.nextInt(89)+10; 
		ex2[i] = r.nextInt(89)+10;
		System.out.printf("문제%d. %d+%d = ",i+1,ex1[i],ex2[i]);
		ans[i]=sc.nextInt();
	} // for

	for(int i = 0;i<k;i++) 
		if(ans[i] == ex1[i] + ex2[i])	right++;
	
	System.out.println("------------------------------");
	System.out.printf("채점합니다. 맞은 갯수 %d(%d점)",right,right*(double)(100/k));
	System.out.println();
	System.out.println("::::틀린문제 정답보기::::");
for(int i = 0;i<k;i++)
	if(ans[i] != ex1[i]+ex2[i])
		System.out.printf("문제 %d %d+%d = %d\n ",i+1,ex1[i],ex2[i],ex1[i]+ex2[i] );

sc.close();
} // Main
} // Class
