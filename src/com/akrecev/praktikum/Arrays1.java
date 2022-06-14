package com.akrecev.praktikum;

public class Arrays1 {
    public static void main(String[] args) {
        // Создайте и заполните массив именами участников сделки
        String[] participants = {"Петр", "Надежда", "Валентин"};
        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
        String[] documents = {"Паспорт", "Водительское удостоверение", "Свидетельство о рождении"};

        // Проверьте количество документов, оно должно быть равно числу участников
        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
            for(int i = 0; i < participants.length; i++) {
                System.out.println(participants[i] + ": " + documents[i]);
            }
        } else {
            /* Для ошибки предусмотрите печать такого сообщения:
						 "Количество документов не соответствует количеству участников сделки." */
            System.out.println("Количество документов не соответствует количеству участников сделки.");
        }
    }
}