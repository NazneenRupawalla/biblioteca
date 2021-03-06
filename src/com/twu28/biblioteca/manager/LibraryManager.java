package com.twu28.biblioteca.manager;

import com.twu28.biblioteca.Console;
import com.twu28.biblioteca.LibraryConsole;
import com.twu28.biblioteca.datastore.Library;

import java.io.IOException;


public class LibraryManager {


    private Library publicLibrary;
    private final Console console;
    private int menuOption;
    private MemberCredentialsManager loginManager;
    private boolean sessionIsAlive=false;

    public LibraryManager()
    {
        this(new LibraryConsole());
    }

    public LibraryManager(Console console) {
        this.console=console;
    }


    public void startTheApplication() throws IOException {
        publicLibrary=Library.getInstance();
        loginManager=new MemberCredentialsManager();
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
                if(checkPreConditionsToReservingABook()) {
                        console.printToConsole("Please enter ID of the book");
                        int ID=getConsoleInput();
                        publicLibrary.reserveBookWithGivenID(ID);
                }
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

    private boolean checkPreConditionsToReservingABook() throws IOException {
        if(sessionIsAlive) return true;

        if(!checkCredentials()) {
            console.printToConsole("Please check your login credentials");
            return false;
        }
        sessionIsAlive=true;
        return true;

    }

    private boolean checkCredentials() throws IOException {
        console.printToConsole("Please Login:\nEnter your Username:");
        String userName = console.takeInputFromConsole();
        console.printToConsole("Enter your password:");
        String password = console.takeInputFromConsole();
        return loginManager.validateMember(userName, password);

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
