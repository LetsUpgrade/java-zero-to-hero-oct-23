package Day4;


//an abstract class can never be instantiated
//an abstract class can have a non-abstract method
public abstract class Animal {

    //overridden
    abstract void makeNoise()  ;

    void sleep(){
        System.out.println("Animal is sleeping");
    }

}

//Cat IS-A Animal
class Cat extends  Animal{

    //A concrete class cannot have an abstract method
    //override method
    void makeNoise(){
        System.out.println("Meow!!Meow!!");
    }
}


//Dog IS-A Animal
class Dog extends  Animal{
    void makeNoise(){
        System.out.println("Ruff Ruff!!");
    }
}


class Tiger extends Animal{
    void makeNoise(){
        System.out.println("Roar!!");
    }
}


class AnimalTester{
    public static void main(String[] args) {
        Cat c = new Cat() ;

        //Animal a = new Animal() ;

        Animal a1 = new Cat() ; //Upcasting
        a1.makeNoise();

        Animal a2 = new Dog() ; //Upcasting
        a2.makeNoise();

        Animal a3 = new Tiger() ; //Upcasting
        a3.makeNoise();


    }
}