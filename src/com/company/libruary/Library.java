package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<BookShelf> bookShelves ;
    int bookShelvesCount = 3;

    public Library(){
        bookShelves = new ArrayList<>(bookShelvesCount);
        for (int i = 0; i < bookShelvesCount; i++){
           bookShelves.add(new BookShelf());
        }
    }

    public void putBook (Book book){
        for (BookShelf bookShelf: bookShelves) {
            if (bookShelf.hasFreeSpace()){
                bookShelf.putBook(book);
                break;
            }
            else {
                System.out.println("шкаф занят");
            }
        }
    }

    public ArrayList<Book> getBooks() {
        ArrayList <Book> allBooks = new ArrayList<>();
        for (BookShelf bookShelf : bookShelves) {
            allBooks.addAll(bookShelf.getBooks());
        }
        return allBooks;
    }
}
