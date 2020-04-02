package 火影忍者;

public class 六道仙人 {
	
	private String name = "名日羽衣";      // private : in the same class
	
	protected String skill_1 = "仙人之眼"; // default : in the same package -> make it protected
	String skill_2 = "仙人之體";           // default : in the same package
	
	protected String skill_3 = "拐杖";    // protected : in the same package & in another package, extends something with protected
	
	String getMyName(){
		return name;
	} // default : in the same package
	
}
