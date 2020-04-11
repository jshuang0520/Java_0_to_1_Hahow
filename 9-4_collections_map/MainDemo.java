import java.util.HashMap;
import java.util.Map;

public class MainDemo{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        // put an element into a map
        map.put("element1", 1);
        map.put("element2", 2);
        map.put("element3", 3);

        // get element through "key"
        System.out.println("element3 is: " + map.get("element3"));
        
        // map remove an element through "key"
        map.remove("element2");

        // for each to print every element
        for (String key: map.keySet()){
            System.out.println(map.get(key));
        }
    }
}