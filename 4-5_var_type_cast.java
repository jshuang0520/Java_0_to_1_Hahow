// Cast
// parseDouble, parseInt, valueOf()
public class DataType{

    // 4. Method
    public static void main(String[] args){

        /* ---------- HW 1 ---------- */
        double dHw = 3.14;
        String dHwS = String.valueOf(dHw);
        System.out.printf("dHwS: %s\nType(dHwS): %s \n", dHwS, dHwS.getClass().getName());
        float dHwf = Float.valueOf(dHwS);

        /* ---------- HW 2 ---------- */
        Float dHwF = Float.valueOf(dHwf);
        System.out.println(dHwF.intValue());




        /* ---------- Course Content ---------- */

        // Casting a "promitive data type" (d1) to an "object" (d2)
        double d1 = 3.14;
        double d2 = Double.valueOf(d1); /* valueOf is a static method. One can use a static method directly, there's no need to new an object! */
        System.out.printf("d1: %s, d2: %s \n", d1, d2);
        // System.out.printf("d2: %s\nType(d2): %s \n", d2, d2.getClass().getName());


        // autoboxing
        double autoboxingD1 = 3.14;
        Double autoboxingD2 = autoboxingD1;
        System.out.printf("autoboxingD1: %s, autoboxingD2: %s \n", autoboxingD1, autoboxingD2);
        System.out.printf("autoboxingD2: %s\nType(autoboxingD2): %s \n", autoboxingD2, autoboxingD2.getClass().getName());

        // unboxing
        Double unboxingD1 = new Double(3.14);
        double unboxingD2 = unboxingD1;
        System.out.printf("unboxingD1: %s, unboxingD2: %s \n", unboxingD1, unboxingD2);
        System.out.printf("unboxingD1: %s\nType(unboxingD1): %s \n", unboxingD1, unboxingD1.getClass().getName());
    
    
    
        // String to primitive data type
        Double d = 3.14;
        Double.parseDouble("3.14");
        // String to primitive data type
        double d9 = 3.14;
        String d9s = String.valueOf(d9);
    
    }
}