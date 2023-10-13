package Day5;

//By default all the methods in an interface arew abstract and public
public interface Vehicle {
       void moveForward() ;
    abstract public void moveBackward() ;

}

class Maruti implements Vehicle{

    @Override
    public void moveForward() {
        System.out.println("Car is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is moving backwards");
    }

    void changeGear(){
        System.out.println("gear changed");
    }
}

class VehicleTester{
    public static void main(String[] args) {
        Vehicle v =  new Maruti() ;
        v.moveBackward();
        v.moveForward();
        ((Maruti)v).changeGear() ;

    }
}