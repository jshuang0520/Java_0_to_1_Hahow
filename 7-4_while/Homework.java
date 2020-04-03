public class Homework{
    public static void main(String[] args){
        int age = 26;
        int quiethb = 65;
        double strength = 0.65;

        Homework demo = new Homework();
        while (strength < 1){
            System.out.println("heart rate for intensity " +  strength + ": " + demo.heartbeat(age, quiethb, strength));
            strength += 0.05;
        }
    }

//    public double heartbeat(int age, int quiethb, double strength){
//        double hb = ((220 - age) - quiethb) * strength + quiethb;
//        return hb;
//    }
    public int heartbeat(int age, int quiethb, double strength){
    	/**
    	 * How to convert double to int in Java?
    	 * https://javarevisited.blogspot.com/2017/01/how-to-convert-double-to-int-in-java.html
    	 */
        int hb = (int) Math.round(((220 - age) - quiethb) * strength + quiethb);
        return hb;
    }
}