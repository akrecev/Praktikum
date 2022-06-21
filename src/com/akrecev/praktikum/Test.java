package com.akrecev.praktikum;

public class Test {
    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    // Объявите метод findMaxExpense
    public static double findMaxExpense(double[] expenses) {
        // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
        double maxExpense = expenses[0];
        for (double expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;

    }
}
