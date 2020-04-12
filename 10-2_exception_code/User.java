import java.util.Optional;

//public class User{
//	// Instance variable
//	private String name;
//	private Integer age;
//	// Methods
//	public String getName() {
//		 return name;
//	}
//	// Methods
//	public void setName(String name) {
//		this.name = name;
//	}
//	// Methods
//	public Integer getAge() {
//		return age;
//	}
//	// Methods
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//}


public class User{
	// Instance variable
	private String name;
	private Integer age;
	// Methods
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	// Methods
	public void setName(String name) {
		this.name = name;
	}
	// Methods
	public Optional<Integer> getAge(){
		return Optional.ofNullable(age);
	}
	// Methods
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
