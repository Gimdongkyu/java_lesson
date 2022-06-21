package access2;

// 다른 패키지에 있는 클래스를 사용할 경우 import 해야 한다.
import access1.Ex_access1;

class MyAccess extends Ex_access1{
	
	void printaccess() {
		System.out.println(data1);// public ok
		System.out.println(data2);//protected ok
//		System.out.println(data3); default 에러
//		System.out.println(data4); private 에러
	
	}	
}


public class Ex3_Access3 {
public static void main(String[] args) {
	Ex_access1 a1 = new Ex_access1();
	System.out.println(a1.data1); // public ok
//	System.out.println(a1.data2); // protected 에러
//  System.out.println(a1.data3); // default 에러
//  System.out.println(a1.data4); // private 에러










}
}
