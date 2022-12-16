package com.skypro.homework11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1: leap year or not a leap year
        int year = 2024;
        checkLeapYear(year);

        //task 2: check OS and year for selection application version
        int deviseOS = 0;  //  "0" - OS = iOS, "1" - OS = Android
        int deviseYear = 2022;
        selectionAppVersion(deviseOS, deviseYear);

        //task 3: determine the delivery time
        int deliveryDistance = 15;
        countDayDelivery(deliveryDistance);

    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " year - is a leap year.");
        } else {
            System.out.println(year + " year - is not a leap year.");
        }
    }

    public static void selectionAppVersion(int typeOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && deviceYear == currentYear) {
            System.out.println("Install program for iOS - link");
        }
        if (typeOS == 0 && deviceYear < currentYear) {
            System.out.println("Install lite version program for iOS - link");
        }
        if (typeOS == 1 && deviceYear == currentYear) {
            System.out.println("Install program for Android - link");
        }
        if (typeOS == 1 && deviceYear < currentYear) {
            System.out.println("Install lite version program for Android - link");
        }
        if (typeOS != 0 && typeOS != 1) {
            System.out.println("Your system not supported");
        }
    }

    public static void countDayDelivery(int distance) {
        if (distance <= 20) {
            System.out.println("delivery - one day");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("delivery - two day");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("delivery - three day");
        } else {
            System.out.println("no delivery");
        }
    }


}
