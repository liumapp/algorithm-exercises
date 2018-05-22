package com.liumapp.algorithm.basic.data;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liumapp
 * @file SortDate.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/21/18
 */
public class SortDate implements Comparable<SortDate> {

    private final int day;

    private final int month;

    private final int year;

    public SortDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(SortDate o) {
        if (this.year > o.getYear()) return +1;
        if (this.year < o.getMonth()) return -1;
        if (this.month > o.getMonth()) return +1;
        if (this.month < o.getMonth()) return -1;
        if (this.day > o.getDay()) return +1;
        if (this.day < o.getDay()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "SortDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
