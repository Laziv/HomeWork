package com.laziv.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Cinema cinema = new Cinema(new Time(9, 0), new Time(23, 0));

        while (true) {
            System.out.println("\n• Введіть 0 для виходу\n" +
                                 "• Введіть 1 щоб додати фільм в фільмотеку\n" +
                                 "• Введіть 2 щоб додати сеанс фільму в розклад\n" +
                                 "• Введіть 3 щоб видалити фільм з фільмотеки і розкладу сеансів\n" +
                                 "• Введіть 4 щоб видалити конкретний сеанс фільму\n" +
                                 "• Введіть 5 щоб вевести фільмотеку\n" +
                                 "• Введіть 6 щоб вевести розклад сеансів\n" +
                                 "• Введіть 7 щоб вевести список сеансів для конкретного фільму");

            switch (getNumber(reader.readLine())) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    int duration;
                    System.out.println("Введіть назву фільму");
                    String title = reader.readLine();
                    System.out.println("Введіть тривалість фільму (в форматі кількість годин:кількість хвилин)");
                    Time time = parseTime(reader.readLine());
                    Time TimeOfWorkDay = cinema.getClose().minusTime(cinema.getOpen());

                    if (TimeOfWorkDay.compareTo(time) >= 0) {
                        cinema.addMovie(new Movie(title, time));
                    } else {
                        System.out.println("Тривалість фільму не може бути більшою тривалості робочого дня");
                    }
                    break;
                case 2:
                    cinema.printMovies();
                    if (cinema.getMoviesLibrary().isEmpty()) {
                        break;
                    }
                    System.out.println("Виберіть фільм із списку і введіть його назву");
                    Movie movie = cinema.getMovie(reader.readLine());
                    if (movie != null) {
                        System.out.println("Введіть час початку фільму (в форматі hh:mm)");
                        Time startTime = parseTime(reader.readLine());
                        Time endTime = startTime.plusTime(movie.getDuration());

                        if (startTime.compareTo(cinema.getOpen()) >= 0 && cinema.getClose().compareTo(endTime) >= 0) {
                            System.out.println("Введіть день тижня для запису сеанса");
                            String day = reader.readLine();
                            cinema.addSeance(new Seance(movie, startTime), day);
                        } else {
                            System.out.println("Сеанс не може початися раніше " + cinema.getOpen() + " і пізніше ніж " + cinema.getClose().minusTime(movie.getDuration()));
                        }
                    }
                    break;
                case 3:
                    cinema.printMovies();
                    if (cinema.getMoviesLibrary().isEmpty()) {
                        break;
                    }
                    System.out.println("Виберіть фільм із списку і введіть його назву");
                    movie = cinema.getMovie(reader.readLine());
                    if (movie != null) {
                        cinema.removeMovie(movie);
                    }
                    break;
                case 4:
                    System.out.println("Введіть день тижня");
                    Days dayEnum;
                    Schedule schedule;
                    try {
                        dayEnum = Days.getDay(reader.readLine());
                        schedule = cinema.getSchedules().get(dayEnum);
                        if (schedule.getSeances().isEmpty()) {
                            System.out.println("Сеансів для цього дня немає");
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Такого дня не існує");
                        break;
                    }
                    schedule.getSeances().forEach(System.out::println);
                    System.out.println("Виберіть сеансу із списку і введіть його час початку (в форматі hh:mm)");
                    time = parseTime(reader.readLine());
                    cinema.removeSeance(time, dayEnum);
                    break;
                case 5:
                    cinema.printMovies();
                    break;
                case 6:
                    cinema.printSchedule();
                    break;
                case 7:
                    cinema.printMovies();
                    if (cinema.getMoviesLibrary().isEmpty()) {
                        break;
                    }
                    System.out.println("Виберіть фільм із списку і введіть його назву");
                    movie = cinema.getMovie(reader.readLine());
                    if (movie != null) {
                        cinema.printSeances(movie);
                    }
                    break;
                default:
                    System.out.println("Потрібно ввести число від 0 до 7");
                    break;
            }
        }
    }

    public static int getNumber(String str) throws IOException {
        while (true) {
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Поимилкове ведення");
                str = reader.readLine();
            }
        }
    }

    public static Time parseTime(String str) throws IOException {
        while (true) {
            try {
                int hour = Integer.parseInt(str.split(":")[0]);
                int min = Integer.parseInt(str.split(":")[1]);
                return new Time(hour, min);
            } catch (Exception e) {
                System.out.println("Поимилкове ведення");
                str = reader.readLine();
            }
        }
    }

}
