package com.laziv.lesson24;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        endTime = startTime.plusTime(movie.getDuration());
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(Seance o) {
        if (this.startTime.getHour() == o.startTime.getHour()) {
            return this.startTime.getMin() - o.startTime.getMin();
        } else {
            return this.startTime.getHour() - o.startTime.getHour();
        }
    }

    @Override
    public String toString() {
        return "Початок " + startTime + " , закінчення, " + endTime + ", фільм " + movie.getTitle();
    }
}
