package pro.sky.java.course1.lesson1;

import javax.security.auth.login.AccountLockedException;

    public class Main {

        public static void main(String[] args) {

            // Задание 1
            int clientOs = 0;
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            // Задание 2
            int clientDeviceYear = 2015;
            if (clientOs == 1 && clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
            if (clientOs == 0 && clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            }

            // Задание 3
            int year = 2004;
            if (year % 4 == 0 && year % 100 > 0) {
                System.out.println("Год является високосным");
            }

            // Задание 4

            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Доставка - 1 сутки");
            } else if (deliveryDistance > 20 && deliveryDistance <= 59) {
                System.out.println("Доставка занимает - 2 суток");
            } else if (deliveryDistance >= 60) {
                System.out.println("Доставка занимает - 3 суток");
            }

            // Задание 5

            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Это зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осень");
                    break;
                default:
                    System.out.println("Некорректный месяц");
                    break;
            }
        }
    }

