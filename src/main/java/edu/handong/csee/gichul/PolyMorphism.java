package edu.handong.csee.gichul;

public class PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit fruit=new Fruit();
		Fruit apple=new Fruit();
		Fruit banana=new Fruit();
		
		System.out.println(fruit.name); //상위클래스에 있는 애들이호출된다. 상속관계에 의해서name 불러도 상위의 것이 먼저 호출된다. 이게PolyMorphism의 개념 
		System.out.println(apple.name);
		System.out.println(banana.name);
		
		fruit.fruit(); //
		apple.fruit();
		banana.fruit();
	}

}


class Fruit{
	String name="난 과일";
	
	public void fruit() {
		System.out.println(name);
	}
}

class Apple extends Fruit{
	String name="난 사과";
	
	public void apple() {
		System.out.println(name);
	}
}

class Banana extends Fruit{
	String name="난 바나나";
	
	public void banana() {
		System.out.println(name);
	}
}
