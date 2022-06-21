package access1;

public class Ex_access1 { // 접근제한 없음
	public int data1 = 10;	//같은 패키지 + 다른 패키지의 자손클래스
	protected int data2 = 20; // 같은 패키지
	int data3 = 30; // 같은 클래스
	private int data4 = 40;
}
