package koreait.day11;

public class ClassX extends ClassAbs {
	// 추상클래스 상속받은 자식(하위)클래스는 반드시 추성메소두 재정의 해야합니다.

	private int num;
	
	
	
	
	public void test() {
		System.out.println("Classx의 test()");
		System.out.println("num = " +num);
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
}
