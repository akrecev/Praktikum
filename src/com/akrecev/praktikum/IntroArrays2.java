package com.akrecev.praktikum;

import java.util.Random;

public class IntroArrays2 {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено рублей: " + expenses[i]);
        }

        int sum = 0;
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }

        System.out.println("Траты в рублях за неделю: " + sum);
    }
}
