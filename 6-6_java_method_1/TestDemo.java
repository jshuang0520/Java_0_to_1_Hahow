public class TestDemo {
    // 4. Methods
	public static void main(String[] args){
        double weight = 65;
		double height = 1.72;

        TestDemo demo = new TestDemo();
        System.out.println(demo.CalBmi(60, 1.72));
    }

    
    // 4. Methods
    public double CalBmi(double weight, double height){
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }
    /**
    float and double datatype in Java
    https://stackoverflow.com/questions/27598078/double-and-double-datatype-in-java

    To sum up:
    - float is represented in 32 bits, with 1 sign bit, 8 bits of exponent, and 23 bits of the significand (or what follows from a scientific-notation number: 2.33728*1012; 33728 is the significand).
    - double is represented in 64 bits, with 1 sign bit, 11 bits of exponent, and 52 bits of significand.
     */
}