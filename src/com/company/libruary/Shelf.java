package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Shelf {
    ArrayList<Book> books = new ArrayList<>();
    int booksCount = 2;

    public void putBook(Book book){
        if(hasFreeSpace()){
            books.add(book);
        }
        else {
            System.out.println("полка занята");
        }
    }

    public void printShelf() {
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public boolean hasFreeSpace (){
        return booksCount > books.size();
    }
}
