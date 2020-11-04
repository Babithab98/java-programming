package com.xworkz.javaprograms.Method;

public class Shop {
	Book giveBook(String name,int pages) {
		Book book=new Book();
		book.name = name;
		book.pages = pages;
		return book;
	}

}
