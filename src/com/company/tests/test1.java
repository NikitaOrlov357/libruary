package com.company.tests;

import java.util.Arrays;
import java.util.OptionalInt;

public class test1 {
    public static void main(String[] args) {
        int [] arr = {12 ,1244 ,5634 ,56 ,57 ,38 ,12 , 90, 4};

//         Arrays.stream(arr).anyMatch(i -> i <= 999 && i > 99);
//         boolean rez =  Arrays.stream(arr).anyMatch(i -> i <= 999 && i > 99);
//        System.out.println(rez);


        //////OptionalInt naz = Arrays.stream(arr).min(Integer::compare);
        ///naz.getAsInt();
                // .forEach(System.out::println);

//        Book b1 = new Book("Пушкин");
//        Book b2 = new Book("Гоголь");
//        Book b3 = new Book("Толстой");
//        Book b4 = new Book("Булгаков");
//        Book b5 = new Book("Достоевкий");
//        Book b6 = new Book("Булгаков");
//
//
//        Book [] books = {b1,b2,b3,b4,b5,b6};
//        Arrays.stream(books)
//                .sorted()
//                .forEach(System.out::println);

    }
    private static int plus (int a, int b){
        return a + b;
    }
}

