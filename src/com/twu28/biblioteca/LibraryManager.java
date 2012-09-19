package com.twu28.biblioteca;

import java.io.IOException;


public class LibraryManager {


    private Library publicLibrary;
    private Console console;
    private int menuOption;
    private MemberCredentialsManager loginManager;

    public LibraryManager(Console console) {
        this.console=console;
    }


    public void startTheApplication() throws IOException {
        publicLibrary=Library.getInstance();
        publicLibrary.setConsole(console);
        do{

            showMenu();
            menuOption = getConsoleInput();
            navigateAccordingToMenuOption();

        }while(menuOption!=5);
    }


    private int getConsoleInput() throws IOException {
        return Integer.parseInt(console.takeInputFromConsole());
    }

    private void navigateAccordingToMenuOption() throws IOException {
        //do I use command pattern to avoid number-case
            switch(menuOption)
            {
                case 1:
                    console.printToConsole("Books\n");
                    publicLibrary.displayBooksTheLibraryOwns();
                    break;
                case 2:
                    loginManager=new MemberCredentialsManager();
                    if(!checkIfUserIsAMember()) {
                        console.printToConsole("Please check your login credentials");
                        break;
                    }
                    console.printToConsole("Please enter ID of the book");
                    int ID=getConsoleInput();
                    publicLibrary.reserveBookWithGivenID(ID);
                    break;
                case 3:
                    console.printToConsole("Please talk to the Librarian. Thank you.");
                    break;
                case 4:
                    publicLibrary.displayMoviesTheLibraryOwns();
                    break;
                case 5:
                    console.printToConsole("Exiting Application");
                    break;
                default:
                    console.printToConsole("Invalid Option");
            }

    }

    private Boolean checkIfUserIsAMember() throws IOException {
        console.printToConsole("Please Login:\nEnter your Username:");
        String userName=console.takeInputFromConsole();
        console.printToConsole("Enter your password:");
        String password=console.takeInputFromConsole();
        //Tell-dont ask???
        return loginManager.validateMember(userName,password);
    }


    private void showMenu() {
        StringBuilder menu=new StringBuilder();
        menu.append("Please choose an option from the menu listed:\n");
        menu.append("1:View the Books\n");
        menu.append("2:Reserve a Book\n");
        menu.append("3:Ask for Details\n");
        menu.append("4:View the Movies\n");
        menu.append("5:Exit\n");
        console.printToConsole(menu.toString());

    }
}
