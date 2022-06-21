package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	//animal 클래스 isDog,IsCrow : 메소드 인자 Object(다형성 구현)
	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		System.out.println(Animal.isCrow(puddle));
		System.out.println(Animal.isDog(puddle));
		System.out.println(Animal.isDog("동물"));
		System.out.println(Animal.isDog(1));
		System.out.println(Animal.isDog(animal));
		System.out.println(Animal.isDog(crow));
		System.out.println(Animal.isDog(animal2));
		System.out.println(Animal.isDog("까마귀"));
		
	}

}
