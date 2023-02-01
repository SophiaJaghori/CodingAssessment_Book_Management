package pkg.cogent.dao;

import pkg.cogent.model.Book;

public interface BookDAO {
	public void addBook();
	public void searchByTitle(String title);
	public void SearchByAuthor(String author);
	public void displayAll();

}
