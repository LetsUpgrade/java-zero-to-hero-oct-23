public class FloatingPoints {

    public static void main(String[] args) {


        byte b = 10 ; //1 byte

        double d = 66.2 ; //8 bytes

        byte c = (byte)(b + d ) ;// (byte)76.2

        System.out.println(c);

        System.out.println(  (byte)86.6 );

    }
}
