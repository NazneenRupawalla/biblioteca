package com.twu28.biblioteca;

import java.io.IOException;

public interface Console {
    public void printToConsole(String toBePrinted);
    public int takeInputFromConsole() throws IOException;

}
