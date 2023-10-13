package Day4;

//Parent OR Base OR Super class
public class Base {
    int a= 10 ;

    void show(){
        System.out.println("Hello");
    }
}

//Child OR Derived OR Sub class
class Child extends Base{ }

class Tester{
    public static void main(String[] args) {
        Child c = new Child() ;
        System.out.println(c.a);
        c.show();

    }
}