package com.twu28.biblioteca;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {
    List<Integer> menuOptions=new ArrayList<Integer>();
    private String toBePrinted;
    private List<String> userInput=new ArrayList<String>();
    SystemManager manager=new SystemManager();
    //SystemManager manager=new SystemManager();

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

        manager.setLibraryConsole(this);

        switch(Integer.parseInt(userInput.remove(0)))
        {
            case 1:
                manager.displayBooksTheLibraryOwns();
                break;
            case 2:
                manager.reserveBookWithGivenID(1);
                break;
            case 3:
                printToConsole("Please talk to the Librarian. Thank you.");
                break;
            case 4:
                manager.displayMoviesTheLibraryOwns();
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
