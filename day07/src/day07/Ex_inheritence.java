package day07;

//부모
class parent{
		int data;
		
		void talk() {
			System.out.println("안녕~");
		}
	}

//자식
class Child extends parent{
	int age;
}




public class Ex_inheritence {
  public static void main(String[] args) {
	  Child ch = new Child();
	  ch.data = 100;
	  ch.talk();
	  
}













}
