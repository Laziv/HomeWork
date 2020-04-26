package com.laziv.lesson24;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private int min;
    private int hour;

    public Time(int hour, int min) {
        setMin(min);
        setHour(hour);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getHour() {
        return hour;
    }

    public int getNumberOfMinutes() {
        if (hour == 0) {
            return min;
        } else {
            return hour * 60 + min;
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Time minusTime(Time time) throws Exception {
        int min1 = hour * 60 + min;
        int min2 = time.getHour() * 60 + time.getMin();
        int result = min1 - min2;
        if (result > 0) {
            return new Time(result / 60, result % 60);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Time plusTime(Time time) {
        int hour = this.hour + time.getHour();
        int min = this.min + time.getMin();
        if (min > 59) {
            hour++;
            min -= 60;
        }
        if (hour < 24) {
            return new Time(hour, min);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        if (hour < 10) {
            return "0" + hour + ":" + (min < 9 ? "0" + min : min);
        } else {
            return hour + ":" + (min < 9 ? "0" + min : min);
        }
    }

    @Override
    public int compareTo(Time time) {
        return (hour * 60 + min) - (time.getHour() * 60 + time.getMin());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }
}
