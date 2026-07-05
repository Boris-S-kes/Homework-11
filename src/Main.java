import java.time.LocalDate;

public class Main {

    public static void leapYear (int year) {
        if (year < 1584) {
            System.out.println(year + " Год не являеться высокосным ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "  год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void downloadApp(int clientOc, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOc <= 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOc > 0 && clientDeviceYear < currentYear) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOc <= 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке ");
        } else if (clientOc > 0 && clientDeviceYear >= currentYear) {
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }
    }

    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            System.out.println(" Доставки нет");
            return -1;
        }





        }










    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


        System.out.println("Task 1");
        leapYear(2021);
        System.out.println(" Task2 ");
        downloadApp(1,2022);
        System.out.println("Task3");
         int deliveryDistance = 95;
         int days = calculateDeliveryDays(deliveryDistance);
         System.out.println("Потребуется дней" + days);




    }
}