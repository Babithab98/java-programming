package com.xworkz.javaprograms.ProgrammingApti;

public class Pattern7 {
	public static void main(String[] args) {
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				if(i==j||i+j==14||j==7||i==7) {
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



