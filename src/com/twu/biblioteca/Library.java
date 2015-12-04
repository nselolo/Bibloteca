package com.twu.biblioteca;

import java.util.*;

public class Library {
    private Menu menu;
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<String> menuItems;


    private ArrayList<LibraryItem> checkedBook;


    public ArrayList<LibraryItem> getCheckedItem() {
        return checkedBook;
    }

    public Library(Menu menu) {
        this.menu = menu;
        checkedBook = new ArrayList<LibraryItem>();
        menuItems = null;
        libraryItems = new ArrayList<LibraryItem>();

        libraryItems.add(new Book("Romeo and Juliet", "MLSihle", "2000"));
        libraryItems.add(new Book("Maru", "MLSithole", "2013"));
        libraryItems.add(new Book("Ditau tsa teng", "MLLekau", "1999"));
        libraryItems.add(new Movie("World war Z","2013","Jeff"));
        libraryItems.add(new Movie("Majaneng","2009","Thabiso"));
        libraryItems.add(new Movie("Skeem Sam","2010","Lehlokwa"));
    }

    public String printWelcomeMessage() {
        return "Welcome to Library, the system is now available";
    }

    public ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void checkOutItem(int position) {
        checkedBook.add(libraryItems.get(position-1));
        libraryItems.remove(position-1);
    }

    public void ReturnItem(int position) {
        libraryItems.add(checkedBook.get(position -1));
        checkedBook.remove(position -1);
    }

    public void PrintBooks(ArrayList<LibraryItem> items) {
        int i = 1;
        System.out.println(" Available Books ****************" + "\n");
        System.out.println("Title |" + "" + "Author |" + "Year published");
        for (LibraryItem book : items) {
            if(book.getClass()==Book.class){
            System.out.println(i + ". " + book.toString());
            i++;
            }
        }
    }

    public void PrintMovies(ArrayList<LibraryItem> items) {
        int i = 1;
        System.out.println(" Available Movies ****************" + "\n");
        System.out.println("Title | Director | Year Released");
        for (LibraryItem movie : items) {
            if(movie.getClass()==Movie.class){
                System.out.println(i + ". " + movie.toString());
                i++;
            }
        }
    }

    public Menu getMenu() {
        return menu;
    }
}
