package Day3;

public class StudentTester {
    /*
    An object is a real world entity. It has 2 characteristics:
    1) State: think of what an object has OR some information about the object
    2) Behaviour: what an object does OR some functionality of the object
     */

    public static void main(String[] args) {
        //student 1: referenced variable OR reference OR instance
        //new Student(): creates an object in the heap memory of the JVM
        Student student1 = new Student() ;
        System.out.println("Student name: "  + student1.name);//null
        System.out.println("Student Roll No: " + student1.rollNo);//0
        student1.name = "Amit" ;
        student1.rollNo = 101 ;

        System.out.println("Student name: "  + student1.name);//Amit
        System.out.println("Student Roll No: " + student1.rollNo);//101


        //instance variables take memory inside the object in the heap area
    }


}

//class is the blueprint for an object
class Student{

    //state OR attributes OR fields OR Instance variables
    String name ;
    int rollNo;

    //behaviour OR instance methods
    void study(){
        System.out.println("Student is studying..");
    }

    void play(){
        System.out.println("student is playing Footbal");
    }

}