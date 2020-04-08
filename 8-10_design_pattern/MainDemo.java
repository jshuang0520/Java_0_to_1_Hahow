import java.util.Calendar;

public class MainDemo{
    public static void main(String[] args){
        /**
        From the perspective of objects outside, they don't need to know how the factory to create that object
        
        Due to the ENCAPSULATION, it's convenient to new an object(of class Product) here!
        */
        Product product = Factory.getProduct();

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // System.out.println(cal.HOUR+":"+cal.MINUTE+":"+cal.SECOND); // it should be 13:29:18, but print 10:12:13 instead...
    }
}