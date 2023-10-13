package MovieProject;

import java.util.Comparator;

public class Movie implements Comparable {
    private  String title;
    private int yearOfRelease ;
    private String genre ;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    Movie(String title, int yearOfRelease, String genre){
        this.title = title ;
        this.yearOfRelease = yearOfRelease ;
        this.genre = genre ;
    }
    @Override
    public String toString() {
        return this.title + " Genre: " + genre + " Year: " + yearOfRelease;
    }

    @Override
    public int compareTo(Object o) {
        Movie m = (Movie)o;//downcasting

        //if first value is greater than second : +ve number
        //if first value is smaller than second : -ve number
        //if both the values are same: 0
        return (this.title) . compareTo (m.title)  ;
    }
}

class GenreComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        //if first value is greater than second : +ve number
        //if first value is smaller than second : -ve number
        //if both the values are same: 0
        return (m1.getGenre()) . compareTo  (m2.getGenre()) ;
    }
}

class YearOfReleaseComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        //if first value is greater than second : +ve number, first comes after the second movie
        //if first value is smaller than second : -ve number, first comes before the second movie
        //if both the values are same: 0
        return (m1. getYearOfRelease()) - (m2.getYearOfRelease()) ;
        // return  1990 - 1999
    }
}

