package com.twu28.biblioteca;

import java.io.IOException;

public interface Console {
    public void printToConsole(String toBePrinted);
    public String takeInputFromConsole() throws IOException;

}
