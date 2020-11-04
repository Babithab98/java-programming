package com.xworkz.javaprograms.ProgrammingApti;

public class Pattern5 {
	public static void main(String[] args) {
		for(int i=0;i<14;i++) {
			for(int j=0;j<14;j++) {
				if(i==j||i+j==13||j==6||i==6) {
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
