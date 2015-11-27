package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class BibliotecaApp {


    public static void main(String[] args)

    {
        Biblioteca library = new Biblioteca();
        Menu menu = new Menu();

        System.out.println(library.printWelcomeMessage() + "\n");


        System.out.println("Please choose an option by entering a menu Item number or press q to exit" + "\n");

        menu.printMenu();
        String option;
        Scanner input = new Scanner(System.in);
        option = input.next();

        while (!Objects.equals("0", option)) {
            if (Objects.equals(option, "1")) {
                PrintBooks(library.getAllBooks());
                input = new Scanner(System.in);
                option = input.next();
            }

            if (Objects.equals(option, "2")) {
                System.out.println("Please enter the number for the book to checkout \n");
                input = new Scanner(System.in);
                option = input.next();
                int x = 0;
                x = Integer.parseInt(option);
                library.checkedOutBooks(x);
            } else {
                System.out.println("Invalid Option - Please choose from the correct list");
                menu.printMenu();
                input = new Scanner(System.in);
                option = input.next();
            }


        }


        if (Objects.equals(option, "0")){
        System.exit(0);
    }

//        public void pr.omptUserInput()
//        {
//            input = new Scanner(System.in);
//            Option= input.next();
//        }
        /*System.out.println(library.getAvailableBooks().toString());
        try {
            library.checkOut("Romeo and Juliet");
        }
        catch(Exception ex)
        {
            System.out.println("Exception:"+ex.getMessage());
        }
        /*System.out.println(library.getAllBooks().toString());
        System.out.println(library.getAvailableBooks().toString());
        try {
            library.checkOut("Fake Checkout Book");
        }
        catch(Exception ex)
        {
            System.out.println("Exception:"+ex.getMessage());
        }
        System.out.println(library.getAllBooks().toString());
        System.out.println(library.getAvailableBooks().toString());
        System.out.println(library.returnBook("Romeo and Juliet"));

        System.out.println(library.returnBook("Fake Checkout Book"));
        System.out.println(library.getAllBooks().toString());
        System.out.println(library.getAvailableBooks().toString());

        System.out.println(library.getMenuItems().toString());
        System.out.println("Hello, world!");*/
    }

//    public static String Option{
//        Scanner input = new Scanner(System.in);
//        return input.next();
//    }

    private static void PrintBooks(ArrayList<Book> Books) {

        System.out.println(" List of All Books " + "****************" + "\n");
        System.out.println("Name of Book |" + "" + "Author of the book |" + "Yeah of bublish");
        for (Book book : Books) {
            System.out.println(book.toString());

        }
    }
}
