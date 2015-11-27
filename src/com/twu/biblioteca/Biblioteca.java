package com.twu.biblioteca;

import java.util.*;

public class Biblioteca {
    private ArrayList<Book> allBooks = new ArrayList<Book>();
    private ArrayList<String> menuItems = null;
    private ArrayList<Book> checkedBook = new ArrayList<>();

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

    public void checkedOutBooks(int position)
    {
        checkedBook.add(allBooks.get(position));
        allBooks.remove(position);
    }

    public void ReturnBooks(int position)
    {
        allBooks.add(checkedBook.get(position));
        checkedBook.remove(position);
    }

}
