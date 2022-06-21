package koreait.day11;

import javax.script.CompiledScript;

public class AShapeTest {
// main 메소드는 클래스로 만들어진 애플리케이션입니다. 추상클래스로 완성됟 애플리케이션에서 새로운 추상메소드를 추가하면?
// 	
	public static void main(String[] args) {
		
	
	AShape shape = new Rectangle();
	Rectangle x = (Rectangle)shape;
	x.setHeight(40);
	x.setWidth(20);
	x.shapeName = "직각사각형";
	System.out.println(x);
	System.out.println("넓이 = " + x.getArea());
		
	Triangle tri = new Triangle(100, 84);
	tri.shapeName = "직각 삼각형";
	System.out.println(tri);
	System.out.println("넓이 = " +tri.getArea());	
	
	Circle cri = new Circle();
	cri.setRadius(89);
	cri.shapeName = "원";
	System.out.println(cri);
	System.out.println("넓이 = " +cri.getArea());
	
	}

}
/*
 * 
 * 참고: 메소드 재정의할때 접근한정자
 * 부모: public -> 자식 default : 오류
 * 부모 default -> 자식 public : 가능
 */

abstract class AShape{
	
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {
		System.out.println("AShape 디폴트 생성자 동잡합니다.");
		
	}
	
	
	//추상 클래스는 커스텀 생성자 만드나요?
	public AShape(int width, int height) {
		this.width = width;
		this.height	= height;
	}
	
	public abstract double getArea();
	
	// 추상클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할 수 있습니다.
	public  Object explain() { // 애플리케이션 완료 후 추상매소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}

	@Override
	public String toString() {
		return "AShape [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	
}// AShape

class Triangle extends AShape{ // width*height/2

	public  double getArea() {
	return width*width/2;	
	}
	public Triangle(int width,int height) {
		super(width,height);
	}

	
}

class Circle extends AShape{	
	private int radius;	// 반지름  반지름*반지름*3.14

	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}

class Rectangle extends AShape{
	
	public double getArea() {
		return width*height;
	}

	
	
	
	
}

