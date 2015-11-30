package com.twu.biblioteca;

import java.util.*;

public class Biblioteca {
    private ArrayList<Book> allBooks = new ArrayList<Book>();
    private ArrayList<String> menuItems = null;

    private ArrayList<Book> checkedBook = new ArrayList<>();


    public ArrayList<Book> getCheckedBook() {
        return checkedBook;
    }


    public Biblioteca() {
        allBooks.add(new Book("Romeo and Juliet", "MLSihle", "2000"));
        allBooks.add(new Book("Maru", "MLSithole", "2013"));
        allBooks.add(new Book("Ditau tsa teng", "MLLekau", "1999"));

    }

    public String printWelcomeMessage() {
        return "Welcome to Biblioteca, the system is now available";
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public String validateSelectedMenuItemAtIndex(int position) throws Exception {
        String menuItem = menuItems.get(position);
        if (menuItem == null) {
            throw new Exception("Select a valid option!");
        }
        return menuItem;
    }

    public void checkedOutBooks(int position) {
        checkedBook.add(allBooks.get(position - 1));
        allBooks.remove(position);
    }

    public void ReturnBooks(int position) {
        allBooks.add(checkedBook.get(position));
        checkedBook.remove(position);
    }

    public void PrintBooks(ArrayList<Book> Books) {
        int i = 1;
        System.out.println(" List of All 1Books " + "****************" + "\n");
        System.out.println("Name of Book |" + "" + "Author of the book |" + "Yeah of bublish");
        for (Book book : Books) {
            System.out.println(i + ". " + book.toString());
            i++;

        }
    }
}
