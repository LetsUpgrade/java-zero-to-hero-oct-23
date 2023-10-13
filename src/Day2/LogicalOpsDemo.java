package Day2;
//Logical operators alwyas compare 2 boolean values
public class LogicalOpsDemo {

    public static void main(String[] args) {

       /* System.out.println( false );
        System.out.println( "T" == "true"); //false

        System.out.println( 5-5 == 0 );
        */
        /*
            LOGICAL AND &&
            T && T   = T
            T && F   = F
            F && T   = F
            F && F   = F
         */

        //System.out.println( true && true);
        //System.out.println(  false && true);

        //LOGICAL OR || : If one of the values if true, the resultant is true


      //if( false   &&    true    )
        if(  10<5   &&    5>2     ) System.out.println("Green");
        else System.out.println("Black");

      //if(  false  ||    true    )
      //if(      true             )
        if(  10<5   ||    5>2     ) System.out.println("Green");
        else System.out.println("Black");

    }
}
