package com.xworkz.javaprograms.inheritance.herirachical;

public class heirachicalInheritenceDemo {
	
	public static void main(String[] args) {
		System.out.println("CSE branch details...");
		CSE c=new CSE();
		c.DataStructure();
		c.MachineLearning();
		c.maths();
		c.physics();
		System.out.println();
		
		Mech m=new Mech();
		System.out.println("Mech branch Details...");
		m.maths();
		m.physics();
		m.appliedThermoDynamics();
		m.machineToolAndOperations();
		System.out.println();
		
		System.out.println("ECE branch Details....");
		ECE e=new ECE();
		e.maths();
		e.physics();
		e.EmbeddedSystems();
		e.FieldTheory();
		System.out.println();
	}

}
