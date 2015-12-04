package com.twu.biblioteca;

public class Movie implements LibraryItem {
    @Override
    public String toString() {
        return Title + " " + Year + " " + Director;
    }


    private String Title;
    private String Year;

    private String Director;

    private String Rating;

    public Movie(String title, String year, String director) {
        Title = title;
        Year = year;
        Director = director;
    }

    @Override
    public String getTitle() {
        return Title;
    }


    @Override
    public String getYear() {
        return Year;
    }

    public String getDirector() {
        return Director;
    }

    public String getRating() {
        return Rating;
    }
}
