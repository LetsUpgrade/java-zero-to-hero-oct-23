package Day2;


import java.util.Scanner;
//days of a week
public class SwitchDemo {

    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 7");
        Scanner truck = new Scanner(System.in) ;
        int n =  truck . nextInt() ;//3

        switch ( n ){
            case 1 :
                System.out.println("Sunday");
                System.out.println("Have a nice day!!");
                break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break ;
            case 4:
                System.out.println("Wednesday"); break;
            default :
                System.out.println(" Thursday OR Friday OR Saturday");
        }
    }
}
