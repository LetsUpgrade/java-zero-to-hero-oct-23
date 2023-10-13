package Day5;

abstract public class Doctor {

    private int a = 10 ;
    //overridden
    void treatPatient(){
        System.out.println("Doctor is treating patient");
    }
     //abstract void treatPatient() ;
}


//Dentist IS-A Doctor
class Dentist extends Doctor{
    @Override
    void treatPatient() {
       // super.treatPatient();
        System.out.println("Teeth Checkup");
    }

    void doRootCanal(){
        System.out.println("Root Canal procedure underway");
    }
}


//Cardiologist IS-A Doctor
class Cardiologist extends Doctor{
    @Override
    void treatPatient() {
        super.treatPatient();
    }
}

class DoctorTester{
    public static void main(String[] args) {
        Doctor d1 = new Dentist() ; //upcasting
        d1.treatPatient();
       // d1.doRootCanal() ;
        Dentist den = (Dentist) d1 ;//downcasting
        //System.out.println(den.a);
        den.doRootCanal();

    }
}