package com.twu28.biblioteca;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {
    List<Integer> menuOptions=new ArrayList<Integer>();
    private String toBePrinted;
    private int menuOption;
    //SystemManager manager=new SystemManager();

    @Override
    public void printToConsole(String toBePrinted) {
           this.toBePrinted=toBePrinted;

    }

    @Override
    public int takeInputFromConsole() throws IOException {
       return menuOption;
    }



    public String getRequiredInputToBePrintedOnConsole() {
        return toBePrinted;
    }

    public void setMenuOptionTakenFromUser(int menuOption) {
        this.menuOption=menuOption;
    }

    public void startTheRequiredProcess() {
        SystemManager manager=new SystemManager();
        manager.setLibraryConsole(this);
        switch(menuOption)
        {
            case 1:
                manager.displayBooksTheLibraryOwns();
                break;
        }
    }
}
