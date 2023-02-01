package pgk.cogent.controller;

import java.util.Scanner;

import pkg.cogent.dao.BookDAOimpl;
import pkg.cogent.service.BookService;


public class BookController {
	BookService bs;
	Scanner sc = new Scanner(System.in);

	public BookController() {
		bs = new BookService();
	}
	public void accpept(int choice) {
		
		switch (choice) {
		case 1:
			bs.save();
			break;
		case 2:
			System.out.println("Please enter the book title");
			String bkTitle = sc.next();
			bs.findTitle(bkTitle);
			break;
		case 3:
			System.out.println("Please etner the book author ");
			String bkAut = sc.next();
			bs.findByAuthor(bkAut);
			break;
		case 4:
			bs.fetch();
			break;
		case 5:
			System.exit(choice);
			break;

		}
	}

}
