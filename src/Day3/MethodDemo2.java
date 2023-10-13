package Day3;
//Method overloading: multiple methods with same name but different parameters
public class MethodDemo2 {
    public static void main(String[] args) {
        show() ;//method calling
        String s = show(7) ; // String s = "Go" ;
        System.out.println(s);
    }

    //method declaration
    static String show( int a){
        System.out.println("Hola"  + a);
        return "9" ;
    }

    static void show(){
        System.out.println("Salam");
    }
}
