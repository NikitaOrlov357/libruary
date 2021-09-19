package com.company.tests;

import com.company.Book;

import java.util.Comparator;

public class BooksComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
