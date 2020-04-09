// import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", new Integer(100));
		map.put("b", new Integer(200));
		
		System.out.println(map);
		
		
		// Returns Set view      
        Set < Map.Entry< String,Integer> > st = map.entrySet();    
        for (Map.Entry< String,Integer> me:st) 
        { 
            System.out.print(me.getKey()+":"); 
            System.out.println(me.getValue()); 
        } 
	}
}