package koerait.day06;

import java.util.Random;

public class C30_RandomTest {
// 난수 발생하는 Random 클래스의 메소드를 테스트 합니다.
public static void main(String[] args) {
	Random r = new Random();		//Random 쿨래스의 객체 생성(new 연산)
	
	System.out.println("1. 정수형 랜던값 10개 출력");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(); // int 범위내에서 랜던값(난수) 만듭니다.
		System.out.println(inum);
	}
	
	System.out.println("1. 정수형 랜던값 10개 출력 - bound(경계값) 있음.");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(100); // 0<= 난수 <100 버위의 랜덤값 만듭니다.
		System.out.println(inum);
	}	// 경계값은 양수값만 사용합니다.
	
	// 1<= 난수 <101 범위의 랜덤값 만듭니다.
System.out.println("3. 특정 범위의 랜덤값 10개 출력 - bound를 이용한 수식");
for(int i=0;i<10;i++) {
	int inum = r.nextInt(100)+1; // 1<= 난수 <101 버위의 랜덤값 만듭니다.
	System.out.println(inum);
}	// 경계값은 양수값만 사용합니다.

//n보다 크거나 같고 m보다 작은 범위 난수 : r.nextInt(m-n)+n 10~99

System.out.println("4. 2~45 범위의 값으로 난수 10개");  // n=2 , m=46
for(int i = 0; i<10;i++) {
	int inum =r.nextInt(44)+2;
	System.out.println(inum);
	
}







}
}
