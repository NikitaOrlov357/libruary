package com.company;

public class Book implements Comparable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return name.compareTo(book.getName());
    }
}
