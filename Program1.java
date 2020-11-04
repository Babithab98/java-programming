package com.xworkz.javaprograms.ProgrammingApti;

public class Program1 {
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("number is divisible by 3 and 5"+i);	
			}
			else if(i%3==0) {
				System.out.println("number is divisble by 3"+i);
			}
			else if(i%5==0) {
				System.out.println("number is divisble by 5"+i);
			}
		}
	}

}
