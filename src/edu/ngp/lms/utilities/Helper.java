package edu.ngp.lms.utilities;

import java.util.Scanner;

import edu.ngp.lms.model.Book;

public class Helper {

	public void showMenu() {
		System.out.println("\n1.Add\n2.Get\n3.Update\n4.Delete\n5.Exit\n");

	}

	public Book readBook() {
		Book book = new Book();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ID : ");
		book.setId(in.nextInt());
		System.out.print("Enter Price : ");
		book.setPrice((Float)in.nextFloat());
		in.nextLine();
		System.out.print("Enter Title : ");
		book.setTitle(in.nextLine());
		System.out.print("Enter Author : ");
		book.setAuthor(in.nextLine());
		System.out.print("Enter Publisher:");
		book.setPublisher(in.nextLine());
		return book;
	}

}
