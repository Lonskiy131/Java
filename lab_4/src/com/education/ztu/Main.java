package com.education.ztu;

import  com.education.ztu.StringPractice;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world!");

        task2("I learn Java!!!");
        task3(4,36);
        task4();
//        task5();
        task6();

    }
    public static void  task2 (String str ){

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Останній символ рядка: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Рядок закінчується на '!!!': " + endsWithExclamation);

        boolean startsWithILearn = str.startsWith("I learn ");
        System.out.println("Рядок починається з 'I learn ': " + startsWithILearn);

        boolean containsJava = str.contains("Java");
        System.out.println("Рядок містить 'Java': " + containsJava);

        int javaIndex = str.indexOf("Java");
        System.out.println("Позиція підрядка 'Java': " + javaIndex);

        String replacedString = str.replace('a', 'o');
        System.out.println("Рядок після заміни: " + replacedString);

        String upperCaseString = str.toUpperCase();
        System.out.println("Верхній регістр: " + upperCaseString);

        String lowerCaseString = str.toLowerCase();
        System.out.println("Нижній регістр: " + lowerCaseString);

        String trimmedString = str.replace("Java", "");
        System.out.println("Рядок після вирізання 'Java': " + trimmedString);
    }
    public static void task3(int num1, int num2) {
        StringBuilder result = new StringBuilder();

        result.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n");
        result.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
        result.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2).append("\n");

        int index = result.indexOf("=");
        while (index != -1) {
            result.replace(index, index + 1, "рівно");
            index = result.indexOf("=", index + 1);
        }

        result.reverse();

        System.out.println(result.toString());
    }
    public static void task4() {
        // Дані про куплені товари
        String[][] items = {
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Джинси", "Жіночий одяг", "1500,78 ₴"},
                {"Спідниця", "Жіночий одяг", "1000,56 ₴"},
                {"Краватка", "Чоловічий одяг", "500,78 ₴"}
        };

        // Вивід чека з використанням Formatter
        System.out.println("Дата та час покупки: \t28.03.2019 13:25:12");
        System.out.println("===========================================");
        System.out.printf("%-2s%-15s%-20s%-10s%n", "№", "Товар", "Категорія", "Ціна");
        System.out.println("===========================================");

        // Виведення куплених товарів
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-2d%-15s%-20s%-10s%n", i + 1, items[i][0], items[i][1], items[i][2]);
        }

        // Розрахунок та вивід загальної вартості
        double total = 0;
        for (String[] item : items) {
            String price = item[2].replace(" ₴", "").replace(",", ".");
            total += Double.parseDouble(price);
        }
        System.out.printf("===========================================\n");
        System.out.printf("Разом: \t\t\t\t\t%.2f ₴%n", total);

        // Доповнення списку товарів до 10 штук
        for (int i = items.length + 1; i <= 10; i++) {
            System.out.printf("%d. \t\t\t\t\t\t\t\t%n", i);
        }
    }
    public static void task5() {

        Locale locale1 = new Locale("ua", "UA");
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("data", locale1);

        Locale locale2 = new Locale("fr", "FR");
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("data", locale2);
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("data",locale);

        ResourceBundle[] Bundles = { resourceBundle, resourceBundle1, resourceBundle2};

        for (ResourceBundle bundle : Bundles) {
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(bundle.getLocale());

            System.out.println("Дата та час покупки: \t28.03.2019 13:25:12");
            System.out.println("===========================================");
            System.out.printf("%-2s%-15s%-20s%-10s%n", "№", bundle.getString("product"), bundle.getString("category"), bundle.getString("price"));
            System.out.println("===========================================");

            // Дані про куплені товари
            String[][] items = {
                    {bundle.getString("product.name.jeans"), bundle.getString("product.category.clothing.female"), "1500.78"},
                    {bundle.getString("product.name.skirt"), bundle.getString("product.category.clothing.female"), "1000.56"},
                    {bundle.getString("product.name.tie"), bundle.getString("product.category.clothing.male"), "500.78"},
                    {bundle.getString("product.name.skirt"), bundle.getString("product.category.clothing.female"), "1000.56"},
                    {bundle.getString("product.name.jeans"), bundle.getString("product.category.clothing.female"), "1500.78"},
                    {bundle.getString("product.name.skirt"), bundle.getString("product.category.clothing.female"), "1000.56"},
                    {bundle.getString("product.name.tie"), bundle.getString("product.category.clothing.male"), "500.78"},
                    {bundle.getString("product.name.skirt"), bundle.getString("product.category.clothing.female"), "1000.56"},
                    {bundle.getString("product.name.jeans"), bundle.getString("product.category.clothing.female"), "1500.78"},
                    {bundle.getString("product.name.skirt"), bundle.getString("product.category.clothing.female"), "1000.56"},

            };

            // Виведення куплених товарів
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-2d%-15s%-20s%-10s%n", i + 1, items[i][0], items[i][1], currencyFormat.format(Double.parseDouble(items[i][2])));
            }

            // Розрахунок та вивід загальної вартості
            double total = calculateTotal(items);
            System.out.printf("===========================================\n");
            System.out.printf("Разом: \t\t\t\t\t%s%n", currencyFormat.format(total));

            // Доповнення списку товарів до 10 штук
            for (int i = items.length + 1; i <= 10; i++) {
                System.out.printf("%d. \t\t\t\t\t\t\t\t%n", i);
            }
            System.out.println();
        }
    }
    public static double calculateTotal(String[][] items) {
        double total = 0;
        for (String[] item : items) {
            total += Double.parseDouble(item[2]);
        }
        return total;
    }
    public static void task6() {
        // Створення об'єкта LocalDateTime з поточною датою та часом
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Виведення дати та часу
        System.out.println("Поточна дата і час: " + currentDateTime);

        // Виведення окремих складових дати та часу
        System.out.println("День тижня: " + currentDateTime.getDayOfWeek());
        System.out.println("День у році: " + currentDateTime.getDayOfYear());
        System.out.println("Місяць: " + currentDateTime.getMonth());
        System.out.println("Рік: " + currentDateTime.getYear());
        System.out.println("Години: " + currentDateTime.getHour());
        System.out.println("Хвилини: " + currentDateTime.getMinute());
        System.out.println("Секунди: " + currentDateTime.getSecond());

        // Перевірка чи рік високосний
        boolean isLeapYear = currentDateTime.toLocalDate().isLeapYear();
        System.out.println("Чи є поточний рік високосним: " + isLeapYear);

        // Створення об'єкта LocalDateTime для початку лабораторної
        LocalDateTime labStartDateTime = LocalDateTime.of(2024, Month.FEBRUARY, 20, 8, 0, 0);

        // Порівняння поточного часу з часом початку лабораторної
        boolean isAfterLabStart = currentDateTime.isAfter(labStartDateTime);
        boolean isBeforeLabStart = currentDateTime.isBefore(labStartDateTime);
        System.out.println("Чи поточний час пізніше за час початку лабораторної: " + isAfterLabStart);
        System.out.println("Чи поточний час раніше за час початку лабораторної: " + isBeforeLabStart);

        // Зміна значення елементів дати та часу
        LocalDateTime modifiedDateTime = currentDateTime.withHour(15).withMinute(30).withSecond(0);
        System.out.println("Змінений час: " + modifiedDateTime);
    }


}

