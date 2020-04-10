// java collections 找 Package java.util
import java.util.ArrayList; // 加強版的陣列
import java.util.List;

public class MainDemo{
    public static void main(String[] args){
        Integer int0 = 0;
        Integer int1 = 1;
        Integer int2 = 2;

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(int0);
        intList.add(int1);
        intList.add(int2);
        
        // for each - print elements
        for(Integer i: intList){
            System.out.println(i);
        }
        
        // remove - element of specific index
        System.out.println("intList after remove(): " + intList.remove(1));
        
        // get
        System.out.println("intList get(): " + intList.get(0));
    }
}

/**
Interface List<E>
https://docs.oracle.com/javase/8/docs/api/java/util/List.html
*/