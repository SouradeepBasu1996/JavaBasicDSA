package StreamsApiPractice;

public class Person {

	private int personId;
	private String name;
	private int age;
	private String city;
	private String country;
	
	public Person() {
		
	}
	
	public Person(int personId, String name, int age, String city, String country) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
