package edu.ngp.lms.iservices;

import edu.ngp.lms.model.Book;

public interface IBookService {
	boolean add(Book book);

	Book getBookId(Integer id);

	boolean update(Book book);

	boolean delete(Integer id);

}
