package pkg.cogent.dao;

import java.util.Scanner;

import pkg.cogent.exception.MandatoryFieldExcpetion;
import pkg.cogent.model.Book;


public class BookDAOimpl implements BookDAO{
	Book book[];
	Book bookObj = new Book();
	
	
	public void validateMandatoryField(Book book)
	{
		if(book==null)
		{
			throw new MandatoryFieldExcpetion("Book object can not be left blank");
		}
		else if(book.getBookID()== 0)
		{
			throw new MandatoryFieldExcpetion("Book ID can not be left blank");
		}
	}

	@Override
	public void addBook() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How man books you want to store? ");
		int size = sc.nextInt();
	    book = new Book[size];
	    for(int i = 0; i<book.length;i++) {
	    	System.out.println("Please enter book Id. ");
	    	int bookId = sc.nextInt();
	    	System.out.println("Please enter book title. ");
	    	String bktitle = sc.next();
	    	System.out.println("Please enter book author.");
	    	String bkAuthor = sc.next();
	    	System.out.println("Please enter book category. ");
	    	String bkCat = sc.next();
	    	System.out.println("Please enter book price. ");
	    	double bkPrice = sc.nextDouble();
	    	bookObj.setBookID(bookId);
	    	bookObj.setTitle(bktitle);
	    	bookObj.setAuthor(bkAuthor);
	    	bookObj.setCategory(bkCat);
	    	bookObj.setPrice(bkPrice);
	    	validateMandatoryField(bookObj);
	    	book[i]= bookObj;
	    }
		
	}

	@Override
	public void searchByTitle(String title) {
		for(int i = 0; i < book.length; i++) {
			if(book[i].getTitle().equals(title)) {
				System.out.println("Book ID is: " + book[i].getBookID());
				System.out.println("Book Title is : " + book[i].getTitle());
				System.out.println("Book Author is : " + book[i].getAuthor());
				
				break;
			}
		}
		System.out.println("Book is not found");
		
	}

	@Override
	public void SearchByAuthor(String author) {
		for(int i = 0; i < book.length; i++) {
			if(book[i].getAuthor().equals(author)) {
				System.out.println("Book ID is: " + book[i].getBookID());
				System.out.println("Book Title is : " + book[i].getTitle());
				System.out.println("Book Author is : " + book[i].getAuthor());
				
				break;
			}
		}
		System.out.println("Book is not found");
		
	}

	@Override
	public void displayAll() {
		for(int i=0;i<book.length;i++)
		{
			System.out.println("book ID:"+ book[i].getBookID());
			System.out.println("book title is :"+book[i].getTitle());
			System.out.println("book author is :" +book[i].getAuthor());
			System.out.println(" book price is : "+ book[i].getPrice());
		}
	}

		
	

}
