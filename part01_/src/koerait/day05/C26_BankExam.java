package koerait.day05;

import java.util.Scanner;

/*
 * GUI : Graphic User Interface(사용자 명령을 아이콘, 메뉴방식으로 처리)
 * CLI : Command Line Interface(사용자 명령을 텍스트로만 처리)
 */

public class C26_BankExam {
	//CLI 방식의 메뉴 선태을 while문으로 연습
public static void main(String[] args) {
	
//연습문제 : 가상은행의 예금/출금/잔고조회 실행
	Scanner sc = new Scanner(System.in);
	boolean run = true;		//	반복을 제어할 변수
	int sel;   //선택 사항 저장
	int balance = 0;  //잔고(잔액)
	
	
	while(run) {// 초기값은 참
		int money;  // while문 지역변수. 입금액과 출금액 저장
		System.out.println("--------------------------------------");
		System.out.println("1. 예금: | 2.출금: | 3.잔고확인: | 4. 종료");
		System.out.println("--------------------------------------");
		System.out.println("메뉴 선택 >>>");
		sel=sc.nextInt();	
		
		switch(sel) {
			case 1:   	//예금처리(예금금약입력 ->잔액에 더하기)
				System.out.print("예금액 >");	
				money = sc.nextInt();
				balance +=money;
				
				System.out.println("고객님의 잔액은 " + balance + "원입니다.");
				break;
			case 2:	//출금 처리(출금금액입력 -> 잔액보다 많지 않을 때 처리 (잔액에서 빼기)) 
				System.out.print("출금액 >");	
				money = sc.nextInt();
				if(money>balance)
					System.out.println("잔액이 부족합니다. 확인하세요.!");	
				else
					balance -= money;
				System.out.println("고객님의 잔액은 " + balance + "원 입니다.");
				break;
			case 3: //잔고(balance) 출력
				System.out.print("현제 잔고: " + balance);
				System.out.println();  // 줄바꿈
				break;
			case 4:	// 반복 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;	//switch 안의 break로 while을 탈출할 수 없습니다.
				break;
				
				default: // 1, 2, 3, 4 외 나머지 값일 때
					System.out.println("잘못돤 선택입니다. 값은 1~4 만 입력하세요.");
				
		
			}
		// while 반복실행의 끝
		}
		System.out.println("******END*******");
	

	
}
}
