package com.twu28.biblioteca;

import java.io.IOException;


public class ApplicationDriver {


    private static SystemManager manager;
    private static LibraryConsole console=new LibraryConsole();

    public static void start() throws IOException {
        console.printToConsole("Welcome to Biblioteca");
        //System.out.println("Welcome to Biblioteca");
        getMenuOptionFromUser();

    }

    private static void getMenuOptionFromUser() throws IOException {
        int menuOption=0;
        manager=new SystemManager();
        manager.setLibraryConsole(console);
        do{

            showMenu();
            menuOption = getConsoleInput();
            navigateAccordingToMenuOption(menuOption);

        }while(menuOption!=4);

    }

    private static int getConsoleInput() throws IOException {
        return console.takeInputFromConsole();
    }

    private static void navigateAccordingToMenuOption(int menuOption) throws IOException {
            switch(menuOption)
            {
                case 1:

                    //System.out.println(
                    console.printToConsole("Books\n");
                    manager.displayBooksTheLibraryOwns();
                    break;
                case 2:
                    //System.out.println(
                    console.printToConsole("Please enter ID of the book");
                    int ID=getConsoleInput();
                    //System.out.println(
                    manager.reserveBookWithGivenID(ID);
                    break;
                case 3:
                    console.printToConsole("Enter your UID");
                    int UID=getConsoleInput();
                    console.printToConsole("Library Crd number: " +manager.returnLibraryCardNumber(UID));
                    break;
                case 4:
                    console.printToConsole("Exiting Application");
                    break;
                default:
                    console.printToConsole("Invalid Option");
            }

    }
      //do I use printable here also??
    private static void showMenu() {
        StringBuilder menu=new StringBuilder();
        menu.append("Please choose an option from the menu listed:\n");
        menu.append("1:View the Books\n");
        menu.append("2:Reserve a Book\n");
        menu.append("3:Ask for Library Card Number\n");
        menu.append("4:Exit\n");


        System.out.println(menu);
    }
}
