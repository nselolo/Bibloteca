package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> menuList;

    public Menu() {
        menuList = new ArrayList<>();
        menuList.add("Exit");
        menuList.add("List All Books");
        menuList.add("Checkout Book");
        menuList.add("Return Book");
        menuList.add("List Movies");
        menuList.add("CheckOut Movie");
    }

    public void printMenu(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }
    }

    public ArrayList<String> getMenuList() {
        return menuList;
    }
}
