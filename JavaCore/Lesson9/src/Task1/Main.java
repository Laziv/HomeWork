package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This homework solution for lesson 8-9 on the Logos Java Core course
 * @author Laziv Mykola
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int numOfSelect = 0;
        String name;
        Months[] arrayMonths = Months.values();
        Seasons[] arraySeasons = Seasons.values();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

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

        do {
            System.out.println("Enter a number from 1 to 10 depending on the selected action");
            try {
                numOfSelect = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            }
        } while (numOfSelect < 1 || numOfSelect > 10);

        switch (numOfSelect) {
            case 1:
                System.out.println("Enter the name of the month");
                name = bufferedReader.readLine();
                try {
                    Months month = Months.valueOf(Months.getMonth(name));
                    System.out.println(month.toString() + " exists");
                } catch (WrongInputConsoleParametersException e) {
                    System.out.println(name + " does not exist");
                }

                break;
            case 2:
                System.out.println("Enter the name of the season");
                name = bufferedReader.readLine();
                try {
                    Seasons.getSeasons(name);
                } catch (WrongInputConsoleParametersException e) {
                    System.out.println(e.getMessage());
                }
                for (Months month : arrayMonths)
                    if (month.getSeason().toString().equals(name.toUpperCase())) {
                        System.out.println(month);
                    }

                break;
            case 3:
                System.out.println("Enter the number of days");
                try {
                    int days = Integer.parseInt(bufferedReader.readLine());
                    Months.isValidNumberOfDays(days);
                    for (Months month : arrayMonths) {
                        if (month.getDays() == days) {
                            System.out.println(month);
                        }
                    }
                } catch (NumberFormatException | WrongInputConsoleParametersException e) {
                    System.out.println(e.getMessage());
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
                try {
                    Seasons season = Seasons.valueOf(Seasons.getSeasons(name));
                    int index = season.ordinal();
                    if (index == arraySeasons.length - 1)
                        index = -1;
                    System.out.println("Next season is " + arraySeasons[index + 1]);
                } catch (WrongInputConsoleParametersException e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 7:
                System.out.println("Enter the current season");
                name = bufferedReader.readLine();
                try {
                    Seasons season = Seasons.valueOf(Seasons.getSeasons(name));
                    int index = season.ordinal() - 1;
                    if (index == -1) {
                        index = arraySeasons.length - 1;
                    }
                    System.out.println("Previous season was " + arraySeasons[index]);
                } catch (WrongInputConsoleParametersException e) {
                    System.out.println(e.getMessage());
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
                try {
                    Months month = Months.valueOf(Months.getMonth(name));

                    if ((month.getDays() % 2) == 0) {
                        System.out.println(name + " has an even number of days");
                    } else {
                        System.out.println(name + " has an odd number of days");
                    }

                } catch (WrongInputConsoleParametersException e) {
                    System.out.println(e.getMessage());
                }

                break;
        }

    }
}
