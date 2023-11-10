package programme_24_method_overriding;
/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
public class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Intrest: " + s.getRateOfIntrest());
        System.out.println("ICICI Rate of Intrest: " + i.getRateOfIntrest());
        System.out.println("AXIS Rate of Intrest: " + a.getRateOfInterest());
    }
}
