package pkg.cogent.service;

import pkg.cogent.dao.BookDAOimpl;

public class BookService {
	BookDAOimpl dao;
	public BookService() {
		dao = new BookDAOimpl();
	}

	public void save() {
		dao.addBook();
	}
	public void findTitle(String title) {
		dao.searchByTitle(title);
	}
	public void findByAuthor(String Aut) {
		dao.SearchByAuthor(Aut);
	}
	public void fetch() {
		dao.displayAll();
	}

}
