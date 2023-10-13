package Day2;

//import java.lang.* ;
import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {


        //creates a new scanner object
        //System.in represents console
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Please enter age");

        int age = sc . nextInt();

        System.out.println("Age is " + age);

        if(age<5)
            System.out.println("Get Loved");
        else if(age<=18)
            System.out.println("Study well");
        else if(age<=50)
            System.out.println("Work hard");
        else if(age>50)
            System.out.println("Pray to God");
    }
}
