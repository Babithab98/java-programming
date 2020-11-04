package com.xworkz.javaprograms.ProgrammingApti;

public class pattern4 {
	public static void main(String[] args) {
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				if(i==j||i+j==12||j==0||j==12) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
