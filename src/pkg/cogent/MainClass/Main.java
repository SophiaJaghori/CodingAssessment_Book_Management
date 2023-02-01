package pkg.cogent.MainClass;

import java.util.Scanner;

import pgk.cogent.controller.BookController;

public class Main {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		System.out.println("Welcome to Book Management Application");
		do {
			
			System.out.println("1-Add book");
			System.out.println("2-find book by title ");
			System.out.println("3-find book by author");
			System.out.println("4-display all book");
			System.out.println("5-Exit");
			System.out.println("Please enter your choice...");
			choice=sc.nextInt();
			bc.accpept(choice);
			
			
		}while(choice!=5);
		
	
		
	}

}
