package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제 list로 바꾸기 작성자: 김동규
public class C48_Mathlist {
	public static void main(String[] args) {
		int size = 5;  // 문재 갯수(반복 횟수)
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	ArrayList<MathProblem> list = new ArrayList<>();
		int ans; int cnt = 0;
	
	System.out.println("--------------------------------");	
	System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");	
	System.out.println("--------------------------------");	
	System.out.println("시작합니다.");
	
	for(int i = 0; i<size;i++) {
		MathProblem temp = new MathProblem('+');
		temp.makeProb();
			System.out.println("문제" + (i+1) + "." + temp.problem());	
		ans = sc.nextInt();
		if(ans == temp.showAnswer()) {
			cnt++;
			temp.setCorrect(true);
		}
		list.add(temp);
	}
		
	System.out.println("----------------------------");
	System.out.println("채점 합니다. 맞은 갯수 " + cnt + "(" + (cnt*(100/size)) + "점" );	
	System.out.println("----------------------------");
	
	for(int i = 0; i<list.size();i++) {
		if(!list.get(i).isCorrect())
			System.out.println("문제" + (i+1) + "." +list.get(i).problem() + list.get(i).showAnswer());
	}
	
	
	}
}
