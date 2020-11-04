package com.xworkz.javaprograms.ProgrammingApti;

public class Pattern3 {
	public static void main(String[] args) {
		int lines=5;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<lines;j++) {
				if(i==0||i==lines-1||i==j||j==0||j==lines-1||i+j==lines-1) {
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
