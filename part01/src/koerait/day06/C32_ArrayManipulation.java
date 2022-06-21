package koerait.day06;

public class C32_ArrayManipulation {
public static void main(String[] args) {
	//배열요소의 삽입/삭제
	int[]test = {11,22,33,44,55,66,77};
		//인덱스 k에 삽일할 때 - 오른쪽 인덱스 증가 방향으로 이동
	//for(int i = 2;i<test.length-1;i++){ // 오작동
	int k = 2;
	for(int i = test.length-2;i>=k;i--){
		test[i+1] = test[i];		//예시 test[6] = test[5];,test[5] = test[4];, ....
	}
	
	test[k]=23;
	for(int i = 0;i<test.length;i++) {
		System.out.print(test[i] +"\t");
	}
	System.out.println();
	int[]test2 = {11,22,33,44,55,66,77};	
	// 인덱스 k번을 삭제할떄 - 왼쪽으로 인덱스 감소방향으로 이동
	for(int i = k+1;i<test2.length;i++) {
		test2[i-1] = test2[i];
	}
	for(int i = 0;i<test2.length-1;i++) { 
		System.out.print(test2[i] +"\t");
	}
	
	
	
}
}
