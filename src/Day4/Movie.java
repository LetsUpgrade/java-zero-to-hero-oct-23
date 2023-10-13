package Day4;

public class Movie {

    //state of the movie object
    private String name ;
    private int yearOfRelease ;

    /*
    Constructor: a special method of a class
    - has the same name as the class
    - has no return type
    - can be overloaded
     */
    //Formal arguments are local variables
    Movie(String name, int yearOfRelease ){
        this.name = name ;
        this.yearOfRelease = yearOfRelease ;
    }

    Movie(){}

    public void setName(String name) {
        int a ;
        //a local variable must be initialized before the first use
       // System.out.println(a);
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    //getters OR Getter Methods: to get the values of the movie object
    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    void entertain(){
        System.out.println("Entertaining movie..");
    }

}

class MovieTester{

    public static void main(String[] args) {

        Movie m1 = new Movie();
        System.out.println( m1.getName() );
        System.out.println( m1.getYearOfRelease() );

        m1.setName("Titanic");
        m1.setYearOfRelease(1997);

        System.out.println( m1.getName() );
        System.out.println( m1.getYearOfRelease() );

        Movie m2 =  new Movie("DDLJ", 1995) ;

        System.out.println(m2.getName());
        System.out.println(m2.getYearOfRelease());

       // System.out.println(m2.name);
       // System.out.println(m2.getYearOfRelease);



    }
}