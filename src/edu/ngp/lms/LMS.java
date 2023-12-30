package edu.ngp.lms;

import java.util.Scanner;

import edu.ngp.lms.model.Book;
import edu.ngp.lms.utilities.Helper;

public class LMS {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Helper helper = new Helper();
		int ch;

		do {
			helper.showMenu();
			System.out.println("Enter Choice :  ");
			ch = in.nextInt();
			switch (ch) {
			case 1 -> {
				System.out.println("Adding a book");
				Book book = helper.readBook();
			}
			case 2 -> System.out.println("Get");
			case 3 -> System.out.println("Update");
			case 4 -> System.out.println("Delete");
			case 5 -> System.out.println("Exit");
			default -> System.out.println("Invalid Choice");
			}
		} while (true);
	}
}
