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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
