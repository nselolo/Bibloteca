package com.twu.biblioteca;

import java.util.*;

public class Library {
    private Menu menu;
    private ArrayList<Book> allBooks;
    private ArrayList<String> menuItems;

    private ArrayList<Book> checkedBook;


    public ArrayList<Book> getCheckedBook() {
        return checkedBook;
    }

    public Library(Menu menu) {
        this.menu = menu;
        checkedBook = new ArrayList<>();
        menuItems = null;
        allBooks = new ArrayList<Book>();
        allBooks.add(new Book("Romeo and Juliet", "MLSihle", "2000"));
        allBooks.add(new Book("Maru", "MLSithole", "2013"));
        allBooks.add(new Book("Ditau tsa teng", "MLLekau", "1999"));
    }

    public String printWelcomeMessage() {
        return "Welcome to Library, the system is now available";
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void checkOutBook(int position) {
        checkedBook.add(allBooks.get(position-1));
        allBooks.remove(position-1);
    }

    public void ReturnBook(int position) {
        allBooks.add(checkedBook.get(position -1));
        checkedBook.remove(position -1);
    }

    public void PrintBooks(ArrayList<Book> Books) {
        int i = 1;
        System.out.println(" List of All Books " + "****************" + "\n");
        System.out.println("Title |" + "" + "Author |" + "Year published");
        for (Book book : Books) {
            System.out.println(i + ". " + book.toString());
            i++;
        }
    }

    public Menu getMenu() {
        return menu;
    }
}
