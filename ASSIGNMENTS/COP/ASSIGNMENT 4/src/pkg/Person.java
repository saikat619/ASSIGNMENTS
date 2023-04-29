package pkg;

public class Person {
	private String first_name, last_name;
	private String city;
	private int age;

	public Person() {}
	public Person(String first_name, String last_name, String city, int age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.age = age;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "\nfirst_name:"+first_name+"\nlast_name:"+last_name+"\ncity:"+city+"\nage:"+age;
	}
	void ShowData() {
		System.out.println("Name:" + first_name + last_name);
		System.out.println("city:" + city);
		System.out.println("age" + age);
	}

}
