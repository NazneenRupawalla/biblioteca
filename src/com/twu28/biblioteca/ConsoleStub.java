package com.twu28.biblioteca;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {
    List<Integer> menuOptions=new ArrayList<Integer>();
    private String toBePrinted;
    private int userInput;
    SystemManager manager=new SystemManager();
    //SystemManager manager=new SystemManager();

    @Override
    public void printToConsole(String toBePrinted) {
           this.toBePrinted=toBePrinted;

    }

    @Override
    public int takeInputFromConsole() throws IOException {
       return userInput;
    }



    public String getRequiredOutputToBePrintedOnConsole() {
        return toBePrinted;
    }

    public void setInputTakenFromUser(int userInput) {
        this.userInput =userInput;
    }

    public void startTheRequiredProcess() {

        manager.setLibraryConsole(this);

        switch(userInput)
        {
            case 1:
                manager.displayBooksTheLibraryOwns();
                break;
            case 2:
                manager.reserveBookWithGivenID(1);
                break;
            case 3:
                printToConsole("Please talk to Librarian. Thank you.");
                break;
            case 4:
                printToConsole("Exiting");
                break;
            default:
                printToConsole("Invalid Option");
                break;


        }
    }
}
