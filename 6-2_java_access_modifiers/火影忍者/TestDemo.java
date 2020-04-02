package 火影忍者;

// <package>.<class>
import 海賊王.騙人布; // remember to import
import 海賊王.鷹眼;  // remember to import

public class TestDemo {

	public static void main(String[] args) {
		因陀羅 son1 = new 因陀羅();
		阿修羅 son2 = new 阿修羅();
		騙人布 student = new 騙人布();
		
		System.out.println("因陀羅:"+son1.skill);
		System.out.println("阿修羅:"+son2.skill);
		System.out.println("騙人布:"+student.skill);
		
		鳴人 student2 = new 鳴人();
		System.out.println("鳴人:"+student2.skill);
		鷹眼 student3 = new 鷹眼();
		System.out.println("鷹眼:"+student3.skill);
	}

}
