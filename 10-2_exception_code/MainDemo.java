import java.sql.Connection;
import java.sql.SQLException;

public class MainDemo{

    public static void main(String[] args){
//    	// example 1
//        Connection conn = null;
//        try{
//            // 
//            conn.commit();
//        }catch(SQLException e1){
//            // exception 1
//            System.out.println("catch SQLException");
//        }catch(Exception e2){
//            // exception 2 - printStackTrace: to log every exception
//            e2.printStackTrace();
//        }finally{
//            // close resource
//            try{
//                conn.close();
//            }catch(SQLException e){
//                e.printStackTrace();
//            }
//        }
//    	// out: NullPointerException, cuz Connection conn = null;
    	
    	
    	// example 2
    	User user = new User();
    	// bad idea: user.getName().trim(); // -----> may cause NullPointerException
    	
//    	// way 1 : if null ..., else ...
//    	if(user.getName() != null) {
//    		// do something
//    		return user.getName();
//    	}
    	
    	// way 2 : java8 - java.util.Optional + orElse()
    	user.setName("JS");
    	System.out.println("Hello, " + user.getName().orElse("Please enter your name") + "!");
    	
    }
}
