import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainDemo{

    public static void main(String[] args) {
    	/* --- way 1 : com = (x, y) -> x - y 就是自己實作 --- */
    	// lambda            
        Comparator<Integer> com = (x, y) -> x - y;
        int result = com.compare(5,2);
        System.out.println(result + "\n");
        
        
        // java8 forEach: 繼承於 collection, 繼承於 Iterator, 所以可以迭代print出所有元素
        List<String> list = new ArrayList<String>();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        
        list.forEach(name -> System.out.println(name));
        
        /* --- way 2 : com2 = Math::subtractExact 就是使用目前已經有的靜態方法做為參考、實作 --- */
        // 「參考」靜態方法
        Comparator<Integer> com2 = Math::subtractExact;
        int result2 = com2.compare(5, 2);
        System.out.println("\n"+result2);
        
        
    }
}