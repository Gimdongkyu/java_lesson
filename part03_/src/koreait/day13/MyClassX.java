package koreait.day13;

//InterfaceA의 현체(구현 클래스, 실체)
public class MyClassX implements InterfaceA{

	@Override
	public void methodA() {
		System.out.println("MyClassX methodA");
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodB" + num);

		return 999;
	}

}
