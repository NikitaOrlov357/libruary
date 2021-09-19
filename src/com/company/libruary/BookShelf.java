package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class BookShelf {

    ArrayList<Shelf> shelves;
    int shelvesCount = 2;

    public BookShelf(){
        shelves = new ArrayList<>(shelvesCount);
        for (int i = 0; i < shelvesCount; i++){
            shelves.add(new Shelf());
        }
    }

    public void putBook(Book book) {
        System.out.println("началось добавление" + book);
        for (Shelf shelf : shelves) {
            if (shelf.hasFreeSpace()) {
                System.out.println("добавлено");
                shelf.putBook(book);
                break;
            }
            else {
                System.out.println("полка занята");
            }
        }
    }

    public boolean hasFreeSpace() {
        return shelvesCount > shelves.size();
    }

    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (Shelf shelf:shelves) {
            books.addAll(shelf.getBooks());
        }
        return books;
    }
    public void printBookShelf(){
        for (Shelf shelf : shelves) {
            System.out.println(shelf);
        }
    }
}

    //public String[] getBooks(){
      //  Stream<String> stream = Stream.empty();
        //Stream.concat(stream,)
    //}

    /*public String[] getBooks(){
        return Arrays.stream(books)
                .map(Book::getName)
                .toArray(String[]::new);
    }*/