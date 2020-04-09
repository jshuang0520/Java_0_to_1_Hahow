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