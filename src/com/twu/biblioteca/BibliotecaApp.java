package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args)

    {
        CommandReader commandReader = new CommandReader();
        Library library = new Library(new Menu());

        System.out.println(library.printWelcomeMessage() + "\n");

        System.out.println("Please choose an option by entering a menu Item number or press q to exit" + "\n");
        mainMenu(library);
        int x = commandReader.readInput();

        while (!(x == 0)) {
            if (x == 1) {
                library.PrintBooks(library.getAllBooks());
                mainMenu(library);
                x = commandReader.readInput();
            }

            if (x == 2) {
                System.out.println("Please enter the number for the book to checkout \n");
                x = commandReader.readInput();
                library.checkOutBook(x);
            }

            if (x == 3) {
                library.PrintBooks(library.getCheckedBook());
                System.out.println("Please enter the number corresponding to the book \n");
                x = commandReader.readInput();
                library.ReturnBook(x);
            }

            if (x == 4) {
                System.out.println("Invalid Option - Please choose from the correct list");
                mainMenu(library);
                x = commandReader.readInput();
            }
        }

    }

    private static void mainMenu(Library library) {
        library.getMenu().printMenu(library.getMenu().getMenuList());
    }


}
