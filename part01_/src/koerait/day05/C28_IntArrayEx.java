package koerait.day05;

import java.util.Scanner;
// 작성자 김동규
public class C28_IntArrayEx {
	/* 1. int 배열크기 5를 선언하세요. 이름은 nums
	 * 2. 배열요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계, 평균을 구합니다. -> 합계는 2번에서 입력받은 for문 안에서 수식 작성하세요.
	 * 4. 입련된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * 			ㄴ 메소드 이름: maxOfarray, minOfArray: 인자는 int 배열, 반환값 형식 int
	 * 
	 */
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
int sum =0;
int[] num = new int[5];  
double aver;


System.out.print("배열의 값을 입력하세요-->");
for(int i = 0; i<num.length;i++) {
	num[i] = sc.nextInt();
	System.out.println("num["+i+"]: " + num[i]);
sum += num[i];
}
System.out.println("배열의 합: " + sum);
aver = (double)sum/num.length;
System.out.printf("배열의 평균 : %.3f\n " ,aver);
  
int max = maxOfarray(num);
System.out.println("배열 num 최대값 max =" + max);

int min = minOfarray(num);
System.out.println("배열 num 최소값 min =" + min);

} // main

public static int maxOfarray(int[]array) {
	int max = array[0];	//1.
	for(int i = 1;i<array.length;i++){	//2.
		if(max<array[i])
			max = array[i];
		
	}
	
	return max;			//4
}

public static int minOfarray(int[]array) {
	int min = array[0];
	for(int i = 1;i<array.length;i++) {
		if(min > array[i])
			min = array[i];
	}
	return min;
}






// 1.max,min 변수를 각각 배열의 0번 요소값으로 초기화 합니다.
// 2.배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
// 3.max가 그 값보다 작으면(min이 그 값보다 크면) max(min) 값을 배열요소 값으로 변경합니다.
// 4.-> 비교가 끝나면 최종 max,min 결정이 됩니다.


}
