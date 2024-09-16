
package minicurso.JF;

public class ArreglosTest {
    public static void main (String []args){
        Arreglos ua = new Arreglos();
//      System.out.print(ua.toString());

        ua.fill0to9();
        System.out.println(ua.toString());
        ua.clean();
        System.out.println(ua.toString());
        ua.unosVer1();
        System.out.println(ua.toString());
        ua.unosVer2();
        System.out.println(ua.toString());
        ua.from9to0();
        System.out.println(ua.toString());
        ua.shiftRight();
        System.out.println(ua.toString());
        ua.shifttLeft();
        System.out.println(ua.toString());
    }
}
