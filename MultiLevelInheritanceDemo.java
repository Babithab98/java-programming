package com.xworkz.javaprograms.inheritance.multilevel;

public class MultiLevelInheritanceDemo {
	
	public static void main(String[] args) {
		
		puppy p= new puppy();
		p.walk();
		p.eat();
		p.sleep();
		p.bark();
		p.play();
		
		dog d=new dog();
		d.walk();
		d.eat();
		d.sleep();
		d.bark();
		
		Animal a=new Animal();
		a.eat();
		a.walk();
		a.sleep();
		
	}

}
