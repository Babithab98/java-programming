package com.xworkz.javaprograms.Method;

public class Anushree {
public static void main(String[] args) {
	System.out.println("anushree is going to post office...");
	postoffice Postoffice=new postoffice();
	Letter letter=Postoffice.giveLetter();
	System.out.println("anushree got letter....");
	System.out.println("anushree reading message...");
	letter.readMessage();
}
}
