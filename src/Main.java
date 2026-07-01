import java.time.LocalDate;

public class Main {

    public static void liptYear(int year) {
        if (year < 1584) {
            System.out.println(year + " Год не являеться высокосным ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "  год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void messageClient(int clientOc, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOc <= 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOc > 0 && clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOc <= 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке ");
        } else if (clientOc > 0 && clientDeviceYear > 2015) {
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }
    }

    public static int cardDelivery(int deliveryDistance) {
        int days = 1;
        System.out.println(" Потребуеться " + days + " дней ");
        if (deliveryDistance < 20) {
            days = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            days += 1;
            return days;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days += 2;
            return days;
        }
        if (deliveryDistance > 100) {
            return -1;
        }else {
            return 0;

        }
    }



    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


        System.out.println("Task 1");
        liptYear(2021);
        System.out.println(" Task2 ");
        messageClient(1, 2022);
        System.out.println("Task3");
        cardDelivery(200);

    }
}