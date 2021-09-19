package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Пушкин");
        Book b2 = new Book("Гоголь");
        Book b3 = new Book("Толстой");
        Book b4 = new Book("Булгаков");
        Book b5 = new Book("Достоевкий");
        Book b6 = new Book("Булгаков");
        Book b7 = new Book("Куприн");
        Book b8 = new Book("Лермонтов");
        Book b9 = new Book("Чехов");
        Book b10 = new Book("Ахматова");

        Library lb1 = new Library();

        Shelf sl1 = new Shelf();

        BookShelf bs1 = new BookShelf();

        bs1.putBook(b1);
        bs1.putBook(b2);
        bs1.putBook(b3);
        bs1.putBook(b4);

        bs1.printBookShelf();

        System.out.println(bs1.getBooks());

//        sl1.putBook(b4);
//        sl1.putBook(b3);
//
//        System.out.println(sl1.getBooks());



        lb1.putBook(b1);
        lb1.putBook(b2);
        lb1.putBook(b3);
        lb1.putBook(b4);
        lb1.putBook(b5);
        lb1.putBook(b6);
        lb1.putBook(b7);
        lb1.putBook(b8);
        lb1.putBook(b9);
        lb1.putBook(b10);

        System.out.println(lb1.getBooks().size());

        /*Shelf polka1 = new Shelf();
        Shelf polka2 = new Shelf();

        BookShelf bs1 = new BookShelf();
        BookShelf bs2 = new BookShelf();

        b1.getName();
        b2.getName();
        b3.getName();

        polka1.putBook(b1);

        polka1.printShelf();

        lb1.putBook(b2);

        User user1 = new User("Паша", 001);

        user1.printUser(001);

        Book [] books = {new Book("бук1"), new Book("бук2"), new Book("бук3")};

        String [] mas = Arrays.stream(books)
                .map(i -> i.getName())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(mas));
    */


    }
}

