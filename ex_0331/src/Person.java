
public class Person {
	private String name;
	private int age;
	private String phone;
	
	public Person() {
	}
	public Person(String name,int age,String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
}
