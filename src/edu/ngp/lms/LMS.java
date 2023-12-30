package edu.ngp.lms;

import java.util.Scanner;

import edu.ngp.lms.model.Book;
import edu.ngp.lms.services.BookService;
import edu.ngp.lms.utilities.Helper;

public class LMS {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Helper helper = new Helper();
		BookService bookService = new BookService();
		Book book;
		int ch;

		do {
			helper.showMenu();
			System.out.print("Enter Choice :  ");
			ch = in.nextInt();
			switch (ch) {
			case 1 -> {
				System.out.println("Adding a book");
				book = helper.readBook();
				bookService.add(book);
			}
			case 2 -> {
				System.out.println("Getting a book");
				System.out.print("Enter a  book id : ");
				Integer id = in.nextInt();
				book = bookService.getBookId(id);
				System.out.println("id : " + book.getId() + "\nTitle : " + book.getTitle() + "\nAuthor : "
						+ book.getAuthor() + "\nPublisher : " + book.getPublisher() + "\nPrice : " + book.getPrice());

			}
			case 3 -> {
				System.out.println("Updating the book");
				book = helper.readBook();
				bookService.update(book);
			}
			case 4 -> {
				System.out.println("Deleting a book");
				System.out.print("Enter book id : ");
				bookService.delete(in.nextInt());
			}
			case 5 -> {
				System.out.println("Exit");
				System.exit(0);
			}
			default -> System.out.println("Invalid Choice");
			}
		} while (true);
	}
}
