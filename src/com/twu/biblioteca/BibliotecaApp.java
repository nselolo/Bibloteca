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
        String option ="";
        Scanner input = new Scanner(System.in);
        option = input.next();

        while (!Objects.equals("0", option)) {
            if (Objects.equals(option, "1")) {
                library.PrintBooks(library.getAllBooks());
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
            }else if (Objects.equals(option, "3")) {
                library.PrintBooks(library.getCheckedBook());
                System.out.println("Please enter the number corresponding to the book \n");
                input = new Scanner(System.in);
                option = input.next();
                int x = 0;
                x = Integer.parseInt(option);
                library.ReturnBooks(x);
            } else {
                System.out.println("Invalid Option - Please choose from the correct list");
                menu.printMenu();
                input = new Scanner(System.in);
                option = input.next();
            }



        }


        if (Objects.equals(option, "0")) {
            System.exit(0);
        }

    }




}
