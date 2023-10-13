package Day4;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList<String> movies = new ArrayList<>() ;
        /*movies . add( new Movie("Matrix", 1999)) ;
        movies . add( new Movie(("Titanic"),  1997)) ;
        movies . add( new Movie("Lal Singh Chaddah", 2022)) ;
        */

        movies . add( "Matrix") ;
        movies . add( "Titanic" );
        movies . add( "Lal Singh Chaddah") ;
       // movies .add( 99);
        System.out.println(movies);

    }
}
