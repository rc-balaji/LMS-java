package edu.ngp.lms.services;

import java.util.ArrayList;
import java.util.List;

import edu.ngp.lms.iservices.IBookService;
import edu.ngp.lms.model.Book;

public class BookService implements IBookService {

	private List<Book> bookList = new ArrayList<Book>();

	@Override
	public boolean add(Book book) {
		return bookList.add(book);
	}

	@Override
	public Book getBookId(Integer id) {
		Book book = new Book();
		for (Book bk : bookList) {
			if (book.getId() == id)
				System.out.println("Enter");
				book = bk;
				break;
		}
		return book;
	}

	@Override
	public boolean update(Book book) {

		bookList.add(bookList.indexOf(book.getId()),book);
		return true;
		
	}

	@Override
	public boolean delete(Integer id) {
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getId() == id) {
				bookList.remove(i);
				return true;
				
				
			}
			
		}
		return false;
	}

}
