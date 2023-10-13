package MovieProject;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyFlix {


    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>() ;

        movies . add (new Movie("Get Out", 2018, "Thriller"));
        movies . add (new Movie("Judwa", 1997, "Drama")) ;
        movies . add (new Movie("Titanic", 1997, "Romance"));


        System.out.println("Before Sorting");
        System.out.println(movies);

        Collections . sort( movies );

        System.out.println("After Sorting");
        System.out.println(movies);

        System.out.println("Genre wise Movies");
        Collections . sort (movies,  new GenreComparator() );
        System.out.println(movies);
        printMoviesDatabase(movies);

        System.out.println("Enter a new movie");
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Title: ");
        String title = sc.nextLine() ;
        System.out.print("Genre: ");
        String genre = sc.nextLine() ;
        System.out.print("Year: ");
        int year = sc.nextInt() ;

        Movie m = new Movie(title, year,  genre);

        movies.add(m);
        printMoviesDatabase(movies);

        movies.remove(1) ;

        System.out.println("After removing a movie");
        printMoviesDatabase(movies);



    }

    static void printMoviesDatabase(ArrayList<Movie> movies){

        System.out.println("Movies Database");
        System.out.println("---------------");
        System.out.println("TITLE\t\tGENRE\t\tYear");
        for ( Movie m: movies ) {

            System.out.println(m.getTitle() + "\t\t" + m.getGenre() + "\t\t" +  m.getYearOfRelease());

        }

    }
}
