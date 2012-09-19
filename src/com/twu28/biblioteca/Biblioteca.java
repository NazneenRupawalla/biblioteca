package com.twu28.biblioteca;



import java.io.IOException;


public class Biblioteca {


    public static void main(String args[]) throws IOException {
        LibraryManager manager=new LibraryManager(new LibraryConsole());
        manager.startTheApplication();
    }

}
