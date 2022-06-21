package koerait.day04;

public class C20_StirngMethod {
public static void main(String[] args) {
	
String messagae ="hello~";	 // java.lang.String (기본패키지 클래스)

	
//String 클래스의 매소드는 많습니다. 다 외우고 사용하는 것이 아니고 매소드의 이름,인자,리턴형식을 참조해서 사용합니다.
//	messagae.length(); // public int length() : 길이
//	messagae.charAt(0);	//	public char charAt(int index)
//	messagae.equals("Hello~"); // public boolean equals(Object anObject), Object는 모든 타입
							   // message가 String 타입이므로 Object는 String으로 해석합니다.

		int len = messagae.length();
		char temp = messagae.charAt(3);		//0부터 시작해서 3번 문자가 무엇인지 리턴
		boolean isState = messagae.equals("Hello~");	//문자열이 같은지
	
	System.out.println("length() = " + len); // 6
	System.out.println("chartAt(3) =" + temp); // l
	System.out.println("equals(\"Hello\")=" + isState ); // false
	
//리턴값 형식은?
	
	messagae.indexOf('e');		//int
	messagae.indexOf("lo");
	messagae.lastIndexOf("lo");
	messagae.substring(2);		//String
	messagae.substring(2,4);
	messagae.replace("11", "*@"); //String
	messagae.startsWith("H");
	messagae.endsWith("~");
	//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.
	
	System.out.println("messagae.indexOf('e')" + messagae.indexOf('e')); //1
	System.out.println("messagae.indexOf(\"lo\")" +messagae.indexOf("lo")); //3
	System.out.println("messagae.substring(2)" +messagae.substring(2)); //부분추출 : llo~
	System.out.println("messagae.substring(2,4)" +messagae.substring(2,4));	// ll 2번부터 2개 (4-2)
	System.out.println("messagae.substring(1,4)" +messagae.substring(1,4));
	System.out.println("messagae.replace(\"11\", \"*@\")" + messagae.replace("ll", "*@")); // 치환: he*@o~
	System.out.println("starswith(\"H\")" + messagae.startsWith("H") );  //false
	System.out.println("endsWith(\"~\")" + messagae.endsWith("~"));		//true
	
	String test = "hello~hello";
	System.out.println("messagae.indexOf(\"lo\")" +messagae.indexOf("lo"));
	System.out.println("messagae.lastindexOf(\"lo\")" +messagae.lastIndexOf("lo"));
	
	
	
	
	
	
}
}
