package com.prodemy.h1;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Greeting g = new Greeting();
        String nama = g.greet("fajrul ichsan kamil");
        System.out.println(nama);
    }
}
