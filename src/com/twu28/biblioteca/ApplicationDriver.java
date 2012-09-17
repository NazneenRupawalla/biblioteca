package com.twu28.biblioteca;

import java.io.IOException;


public class ApplicationDriver {


    private SystemManager manager;
    private LibraryConsole console=new LibraryConsole();
    private int menuOption;

    public void start() throws IOException {
        console.printToConsole("Welcome to Biblioteca");
        getMenuOptionFromUser();

    }

    private void getMenuOptionFromUser() throws IOException {
        manager=new SystemManager();
        manager.setLibraryConsole(console);
        do{

            showMenu();
            menuOption = getConsoleInput();
            navigateAccordingToMenuOption();

        }while(menuOption!=4);

    }

    private int getConsoleInput() throws IOException {
        return console.takeInputFromConsole();
    }

    private void navigateAccordingToMenuOption() throws IOException {
            switch(menuOption)
            {
                case 1:
                    console.printToConsole("Books\n");
                    manager.displayBooksTheLibraryOwns();
                    break;
                case 2:
                    console.printToConsole("Please enter ID of the book");
                    int ID=getConsoleInput();
                    manager.reserveBookWithGivenID(ID);
                    break;
                case 3:
                    console.printToConsole("Enter your UID");
                    int UID=getConsoleInput();
                    console.printToConsole("Library Card Number: " +manager.returnLibraryCardNumber(UID));
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
