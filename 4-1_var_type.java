package hihihi;
import java.util.Calendar;

public class Demo{
    
    public static String name = "Johnson";
    public static String gender;
    
    public static void main(String[] args){ // not String args[]
        
        String gender = "Man";
        Calendar calendar = Calendar.getInstance();
        int age = (calendar.get(Calendar.YEAR)-1993);
        
        System.out.println("Hi, JS!"+"\n"+"name:"+name+"\n"+"age:"+age+"\n"+
        "gender:"+gender);
    }
}