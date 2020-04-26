package com.laziv.lesson24;

import java.util.*;

public class Cinema {
    private TreeMap<Days, Schedule> schedules = new TreeMap<>();
    ;
    private ArrayList<Movie> moviesLibrary = new ArrayList<>();
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        try {
            close.minusTime(open);
            this.open = open;
            this.close = close;
        } catch (Exception e) {
            System.out.println("Кінотеатр не може зачинятись раніше ніж відчинятись.");
            System.exit(1);
        }
    }

    public ArrayList<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }

    public TreeMap<Days, Schedule> getSchedules() {
        return schedules;
    }

    public Time getOpen() {
        return open;
    }

    public Time getClose() {
        return close;
    }

    public void addMovie(Movie movie) {
        moviesLibrary.add(movie);
        System.out.println("Фільм " + movie.getTitle() + " додано");
    }

    public void removeMovie(Movie movie) {
        if (moviesLibrary.remove(movie)) {
            Iterator<Schedule> iterator = schedules.values().iterator();
            while (iterator.hasNext()){
                Schedule schedule = iterator.next();
                schedule.getSeances().removeIf(s -> s.getMovie().equals(movie));
                if (schedule.getSeances().isEmpty()){
                    iterator.remove();
                }
            }
            System.out.println("Видалено");
        }
    }

    public Movie getMovie(String title) {
        Optional<Movie> optionalMovie = moviesLibrary.stream().filter(m -> m.getTitle().equalsIgnoreCase(title)).findFirst();
        if (optionalMovie.isPresent()) {
            return optionalMovie.get();
        } else {
            System.out.println("Фільм " + title + " не знайдено");
            return null;
        }
    }

    public void printMovies() {
        if (moviesLibrary.isEmpty()) {
            System.out.println("В фільмотеці фільмів поки що немає, спочатку додайте фільм(и)");
        } else {
            moviesLibrary.forEach(System.out::println);
        }
    }

    public void printSchedule() {
        if (schedules.isEmpty()) {
            System.out.println("Розклад поки що пустий, спочатку додайте сеанс(и)");
        } else {
            for (Map.Entry<Days, Schedule> entry : schedules.entrySet()) {
                System.out.println(entry.getKey().getTranslation());
                entry.getValue().getSeances().forEach(System.out::println);
                System.out.println("-------------------------");
            }
        }
    }

    public void printSeances(Movie movie) {
        long count = 0;
        for (Map.Entry<Days, Schedule> entry : schedules.entrySet()) {
            System.out.println(entry.getKey().getTranslation());
            count += entry.getValue().getSeances().stream().filter(s -> s.getMovie().equals(movie)).peek(System.out::println).count();
        }
        if (count == 0) {
            System.out.println("Сеансів для цього фільму немає");
        }
    }

    public void addSeance(Seance seance, String day) {
        Days dayEnum;
        try {
            dayEnum = Days.getDay(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Такого дня не існує");
            return;
        }

        Schedule schedule = schedules.get(dayEnum);
        if (schedule == null) {
            schedule = new Schedule();
        } else {
            for (Seance s : schedule.getSeances()) {
                if (seance.getStartTime().compareTo(s.getStartTime()) >= 0 && seance.getStartTime().compareTo(s.getEndTime()) <= 0
                        || seance.getEndTime().compareTo(s.getStartTime()) >= 0 && seance.getEndTime().compareTo(s.getEndTime()) <= 0) {
                    System.out.println("Сеанс не додано, в цей час вже існує сеанс фільму");
                    return;
                }
            }
        }
        schedule.addSeance(seance);
        schedules.put(dayEnum, schedule);
        System.out.println("Сеанс додано, початок " + seance.getStartTime() + " кінець " + seance.getEndTime());
    }

    public void removeSeance(Time startTime, Days day) {
        Schedule schedule = schedules.get(day);
        schedule.removeSeance(startTime);
        if (schedule.getSeances().isEmpty()){
            schedules.remove(day);
        }else {
            schedules.replace(day, schedule);
        }
    }

}
