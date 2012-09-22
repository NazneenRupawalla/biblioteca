package com.twu28.biblioteca;



import com.twu28.biblioteca.datastore.Library;
import com.twu28.biblioteca.manager.MemberCredentialsManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {
    List<Integer> menuOptions=new ArrayList<Integer>();
    private String toBePrinted;
    private List<String> userInput=new ArrayList<String>();
    Library publicLibrary;

    @Override
    public void printToConsole(String toBePrinted) {
           this.toBePrinted=toBePrinted;

    }

    @Override
    public String takeInputFromConsole() throws IOException {
       return userInput.remove(0);
    }



    public String getRequiredOutputToBePrintedOnConsole() {
        return toBePrinted;
    }

    public void setInputTakenFromUser(String userInput) {
        this.userInput.add(userInput);
    }

    public void startTheRequiredProcess() throws IOException {

        publicLibrary=Library.getInstance();
        publicLibrary.setConsole(this);

        switch(Integer.parseInt(userInput.remove(0)))
        {
            case 1:
                publicLibrary.displayBooksTheLibraryOwns();
                break;
            case 2:
                MemberCredentialsManager loginManager=new MemberCredentialsManager();
                loginManager.validateMember(takeInputFromConsole(),takeInputFromConsole());
                publicLibrary.reserveBookWithGivenID(1);
                break;
            case 3:
                printToConsole("Please talk to the Librarian. Thank you.");
                break;
            case 4:
                publicLibrary.displayMoviesTheLibraryOwns();
                break;
            case 5:
                printToConsole("Exiting");
                break;
            default:
                printToConsole("Invalid Option");
                break;
        }
    }

    public void setLoginCredentialsFromUser(String credentials)
    {

      this.userInput.add(credentials);
    }
}
