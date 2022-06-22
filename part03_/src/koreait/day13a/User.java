package koreait.day13a;

// 객체의 비교 두번째 방법 : 비교할 수 있는 Comparable<User> 인터페이
public class User implements Comparable<User> {
private String name;
private int age;

public User(String name, int age) {
	this.age =age;
	this.name = name;
	
}

public String getName() {
	return name;
}
public int getAge() {
	return age;
}

// Comparable 인터페이스 추상 메소드 구현 
@Override
public int compareTo(User o) {	// 현재 객체의 age와 인자값 age 비교
	Integer o1 = this.age;
	Integer o2 = o.getAge();
	
	return o1.compareTo(o2); // 오름 차순
}

//object 클래스 toStinrg() 재정의
@Override
public String toString() {
	return "[name=" + name + ", age=" + age + "]";
}


}
