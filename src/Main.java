import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2 я решил объеденить в один. Программа выводит верную ссылку)
        int clientOS = 1;
        int clientDeviceYear = 2014;
        boolean clientDeviceYearOld = (clientDeviceYear < 2015);
        if (clientOS == 0 && clientDeviceYearOld == false) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYearOld == true) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYearOld == false) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYearOld == true) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        int year = 2021;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + "год не является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 100;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:3");
        } else {
            System.out.println("Не дсотавляем");
        }

        // Задание 5

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима =(");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна =(");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Ура! Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень =(");
                break;
            case 12:
                System.out.println("Зима =(");
                break;

            default:
                System.out.println("А в году вообщето 12 месяцев");
        }
    }
}
