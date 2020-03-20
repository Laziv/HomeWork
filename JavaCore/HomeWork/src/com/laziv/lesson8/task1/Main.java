package com.laziv.lesson8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(
                "1) Check if such a month exists\n" +
                        "2) Get a list of months for the season\n" +
                        "3) Get a list of months by number of days\n" +
                        "4) Get a list of months with fewer days\n" +
                        "5) Get a list of months with the most days\n" +
                        "6) Get a next season of the year\n" +
                        "7) Get a previous season of the year\n" +
                        "8) Get a list of months with an even number of days\n" +
                        "9) Get a list of months with an odd number of days\n" +
                        "10) Check a month for an even number of days\n");
        int numOfSelect = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter a number from 1 to 10 depending on the selected action");
            try {
                numOfSelect = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("This is not a number");
            }
        } while (numOfSelect < 1 || numOfSelect > 10);


        String name;
        Months[] arrayMonths = Months.values();
        Seasons[] arraySeasons = Seasons.values();
        switch (numOfSelect) {
            case 1:
                System.out.println("Enter the name of the month");
                name = bufferedReader.readLine();
                if (Months.indexOf(name.toUpperCase()) >= 0)
                    System.out.println(name + " exists");
                else
                    System.out.println(name + " does not exist");

                break;
            case 2:
                System.out.println("Enter the name of the season");
                name = bufferedReader.readLine();
                for (Months month : arrayMonths)
                    if (month.getSeason().toString().equals(name.toUpperCase()))
                        System.out.println(month);
                break;
            case 3:
                System.out.println("Enter the number of days");
                int days = Integer.parseInt(bufferedReader.readLine());
                for (Months month : arrayMonths) {
                    if (month.getDays() == days)
                        System.out.println(month);
                }
                break;
            case 4:
                for (Months month : arrayMonths) {
                    if (month.getDays() <= 30)
                        System.out.println(month);
                }
                break;
            case 5:
                for (Months month : Months.values()) {
                    if (month.getDays() > 30)
                        System.out.println(month);
                }
                break;
            case 6:
                System.out.println("Enter the current season");
                name = bufferedReader.readLine();
                for (int i = 0; i < arraySeasons.length; i++) {
                    if (arraySeasons[i].toString().equals(name.toUpperCase())) {
                        if (i == Seasons.values().length - 1)
                            i = -1;
                        System.out.println("Next season is " + arraySeasons[i + 1]);
                    }
                }
                break;
            case 7:
                System.out.println("Enter the current season");
                name = bufferedReader.readLine();
                for (int i = 0; i < arraySeasons.length; i++) {
                    if (arraySeasons[i].toString().equals(name.toUpperCase())) {
                        if (i == 0)
                            i = arraySeasons.length;
                        System.out.println("Previous season was " + arraySeasons[i - 1]);
                    }
                }
                break;
            case 8:
                for (Months month : arrayMonths)
                    if ((month.getDays() % 2) == 0)
                        System.out.println(month);

                break;
            case 9:
                for (Months month : arrayMonths)
                    if ((month.getDays() % 2) != 0)
                        System.out.println(month);

                break;
            case 10:
                System.out.println("Enter the name of the month");
                name = bufferedReader.readLine();
                int index = Months.indexOf(name.toUpperCase());
                if (index >= 0) {
                    if ((arrayMonths[index].getDays() % 2) == 0)
                        System.out.println(name + " has an even number of days");
                    else
                        System.out.println(name + " has an odd number of days");

                } else
                    System.out.println(name + " does not exist");

                break;
        }

    }
}