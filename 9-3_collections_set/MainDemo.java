import java.util.HashSet;
import java.util.Set;

public class MainDemo{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        
        // set remove("value of that element")
        set.remove(3);
        
        // size()
        System.out.println("size: " + set.size());

        // it's not sequential in set (so, there's no get(int index) method)
        for (Integer s: set){
            System.out.println(s);
        }
    }
}