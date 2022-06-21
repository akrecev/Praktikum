package com.akrecev.praktikum;

public class Test {
    public static void main(String[] args) {
        String catName = "Пиксель";
        String hamsterName = "Байт";
        sayHello("Андрей");
        sayHello(catName);
        sayHello(hamsterName);

    }

    public static void sayHello(String username) {
        System.out.println("Привет, " + username);
    }
}
