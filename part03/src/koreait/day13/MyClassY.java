package koreait.day13;

public class MyClassY implements InterfaceB{
	
	@Override
	public String name(String name) {

		return "MyClassY" + name;
	}

}

class MyClassZ implements InterfaceA,InterfaceB{
	
	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
	}
	
	@Override
	public int methodB(int num) {
		System.out.println("MyClassZ methodB" + num);
		return 3333;
	}
	
	@Override
	public String name(String name) {
		return "MyClassZ : " + name;
	}

}
