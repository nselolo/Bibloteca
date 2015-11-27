package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu
{

    private ArrayList<String> menuList = new ArrayList<>();

    public Menu() {
        menuList.add("Exit");
        menuList.add("List All Books");
        menuList.add("Checkout Book");
        menuList.add("Return Book");

    }

    public void printMenu()
   {
       for (int i = 0; i < menuList.size(); i++) {
           System.out.println(i +". "+menuList.get(i));
       }
   }
}
