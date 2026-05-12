package batch70_class;
class Student implements Cloneable
{
	int age;
	String name;
	Address address;
	public Student(int age, String name,Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
class Address
{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}


public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Address ad1 = new Address("Hyderabad");
		Student s1 = new Student(19,"nandan",ad1);
		Student s2=(Student) s1.clone();
		
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		s2.address.city = "banglore";
		System.out.println(s1.address.city);
		System.out.println("s2 address after changing " + s2.address.city);
		

	}

}
