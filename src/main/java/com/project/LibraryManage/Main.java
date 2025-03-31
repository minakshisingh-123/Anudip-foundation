package com.project.LibraryManage;

	import model.Book;
	import model.User;
	import service.BookService;
	import service.UserService;

	import java.util.Scanner;

	public class Main{
	    private static final BookService bookService = new BookService();
	    private static final UserService userService = new UserService();
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n== Library Management System ==");
	            System.out.println("1. Add a Book");
	            System.out.println("2. View All Books");
	            System.out.println("3. Add a User");
	            System.out.println("4. View All Users");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    addBook();
	                    break;
	                case 2:
	                    viewAllBooks();
	                    break;
	                case 3:
	                    addUser();
	                    break;
	                case 4:
	                    viewAllUsers();
	                    break;
	                case 5:
	                    System.out.println("Exiting... Thank you");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

	    // Method to add a new book
	    private static void addBook() {
	        System.out.print("Enter book title: ");
	        String title = scanner.nextLine();
	        System.out.print("Enter book author: ");
	        String author = scanner.nextLine();

	        Book book = new Book();
	        book.setTitle(title);
	        book.setAuthor(author);
	        bookService.addBook(book);

	        System.out.println("Book added successfully!");
	    }

	    // Method to display all books
	    private static void viewAllBooks() {
	        System.out.println("\n===== Book List =====");
	        for (Book book : bookService.getAllBooks()) {
	            System.out.println("ID: " + book.getBid() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
	        }
	    }

	    // Method to add a new user
	    private static void addUser() {
	        System.out.print("Enter user name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter user email: ");
	        String contact = scanner.nextLine();

	        User user = new User();
	        user.setName(name);
	        user.setContact(contact);
	        userService.addUser(user);

	        System.out.println("User added successfully!");
	    }

	    // Method to display all users
	    private static void viewAllUsers() {
	        System.out.println("\n===== User List =====");
	        for (User user : userService.getAllUsers()) {
	            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Contact: " + user.getContact());
	        }
	    }
	}


