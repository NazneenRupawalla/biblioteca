package com.twu28.biblioteca;



import com.twu28.biblioteca.manager.LibraryManager;

import java.io.IOException;


public class Biblioteca {


    public static void main(String args[]) throws IOException {
        LibraryManager manager=new LibraryManager(new LibraryConsole());
        manager.startTheApplication();
    }

}
