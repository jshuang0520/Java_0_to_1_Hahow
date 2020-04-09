//import java.util.HashSet;
//import java.util.Set;

/**

---------------------------------------------------
-------------------------
collections 集合
-------------------------
1. 將許多同一種資料型態的物件集合在一起
2. 比陣列(Array)更有彈性更好處理
3. list, set, map


--
Interface Collection<E>
https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

---------------------------------------------------


---------------------------------------------------
-------------------------
List
-------------------------
1. 將物件依序存放，並依序取出
2. 可以存放重複的物件

List<String> list = new ArrayList<String>();

list.add("string1");
list.add("string2");

--
Interface List<E>
https://docs.oracle.com/javase/8/docs/api/java/util/List.html

---------------------------------------------------


---------------------------------------------------
-------------------------
Set
-------------------------
1. 不依序存放物件
2. 存放物件不可重複

Set<String> set = new HashSet<String>();
set.add("string1");
set.add("string2");
set.add("string1");

--

Interface Set<E>
https://docs.oracle.com/javase/8/docs/api/java/util/Set.html

Set in Java
https://www.geeksforgeeks.org/set-in-java/

--
import java.util.*; 
// import java.util.HashSet;

public class SetDemo{
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("string1");
		set.add("string2");
		set.add("string1");
		System.out.println(set);
	}	
} 
// [string1, string2]

---------------------------------------------------



---------------------------------------------------
-------------------------
Map
(like python's dictionary)
-------------------------
1. 將物件以key, value的方式儲存在 Map 物件當中
2. 使用 key 取得存放的物件
3. Map(key, value)

Map<String, Integer> map = new HashMap<String, Integer>();

--
Interface Map<K,V>
Type Parameters:
K - the type of keys maintained by this map
V - the type of mapped values
https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

--
Map Interface in Java
https://www.geeksforgeeks.org/map-interface-java-examples/

---------------------------------------------------



*/
