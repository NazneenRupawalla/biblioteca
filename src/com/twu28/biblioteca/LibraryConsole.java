package com.twu28.biblioteca;

import com.twu28.biblioteca.Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class LibraryConsole implements Console {


    @Override
    public void printToConsole(String toBePrinted) {
       System.out.println(toBePrinted);

    }

    @Override
    public int takeInputFromConsole() throws IOException {

        BufferedReader consoleInput=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(consoleInput.readLine());

    }
}
