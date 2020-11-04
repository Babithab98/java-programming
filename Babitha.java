package com.xworkz.javaprograms.Method;

public class Babitha {
	public static void main(String[] args) {
		Shop shop =new Shop();
		System.out.println("Babitha is going to shop..");
		Book book = shop.giveBook("vidhya", 100);
		System.out.println("Babitha got book..");
		book.open();
		book.turn();
		book.close();
		
	}

}
