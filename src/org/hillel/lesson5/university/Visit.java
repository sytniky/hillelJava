package org.hillel.lesson5.university;

/**
 * Created by yuriy on 20.11.15.
 */
public class Visit {

    private String date;

    public Visit(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "date='" + date + '\'' +
                '}';
    }
}
