package batch70_class;

class Student1{
	int age;
	String name;
	Address1 address;
	public Student1(int age, String name, Address1 address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public Student1(Student1 s1) {
			this.age = s1.age;
			this.name = s1.name;
			this.address = new Address1(s1.address);//deep copy important
			
		}
}

class Address1{
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
	}
	
	
}

public class DeepCopy {

	public static void main(String[] args) {
		Address1 add1 = new Address1("hyderabad");
		Student1 s1 = new Student1(19,"nandu",add1);
		Student1 s2 = new Student1(s1);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println("*************************************************");
		
		System.out.println(s2.age);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("*****************************************************");
		s2.address.city = "banglore";
		System.out.println(s2.address.city);
		System.out.println(s1.address.city);

	}


}

