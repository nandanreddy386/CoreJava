package com.example1;
public class Cricketer {
	// Declaration
	// instance
	String cricketerName;
	int jerseyNo;
	// static
	static String countryName;// null
	static int countryID;// 0
	void main(String[] args) {
		System.out.println("Indian Cricket Team info  ");
		// Creating an Object of a Cricketer
		// LHS = RHS
		// LHS is a Class_name(Cricketer) with Object_Reference_variable(msd)
		// RHS is a new keyword to create Object in Java with Constructor() calling;
		System.out.println("****OBject1 info ");
		Cricketer msd = new Cricketer();
		msd.jerseyNo = 7;
		msd.cricketerName = "Dhoni";
		// Initialization
		countryID = 91;
		countryName = "India";
		// Accessing the static data
		System.out.println("Country Name: " + countryName);
		System.out.println("COuntry ID : " + countryID);
		// Accessing the instance data with Object Reference variable
		System.out.println("Jersey Number : " + msd.jerseyNo);
		System.out.println("Cricketer Name : " + msd.cricketerName);
		System.out.println("****OBject2 info **********");
		Cricketer virat = new Cricketer();
		virat.jerseyNo = 18;
		virat.cricketerName = "Virat Kohli";
		System.out.println("Country Name: " + virat.countryName);// India
		System.out.println("COuntry ID : " + virat.countryID);// 91
		System.out.println("Jersey Number : " + virat.jerseyNo);// 0
		System.out.println("Cricketer Name : " + virat.cricketerName);// null
		System.out.println("****OBject3 info **********");
		Cricketer rohit = new Cricketer();
		rohit.jerseyNo = 45;
		rohit.cricketerName = "Rohit Sharama";
		System.out.println("Country Name: " + countryName);// India
		System.out.println("COuntry ID : " + countryID);// 91
		System.out.println("Jersey Number : " + rohit.jerseyNo);// 0
		System.out.println("Cricketer Name : " + rohit.cricketerName);// null
		System.out.println("****OBject4 info **********");
		Cricketer kl = new Cricketer();
		countryID = 92;
		countryName = "Bharath";
		System.out.println("Country Name: " + countryName);//
		System.out.println("COuntry ID : " + countryID);//
		System.out.println("Jersey Number : " + kl.jerseyNo);//
		System.out.println("Cricketer Name : " + kl.cricketerName);//
		// Accessing the instance data without object
		// Cannot make a static reference to the non-static field cricketerName
//		System.out.println(cricketerName);//
		// Cannot make a static reference to the non-static field jerseyNo
//		System.out.println(jerseyNo);//
	}
}
