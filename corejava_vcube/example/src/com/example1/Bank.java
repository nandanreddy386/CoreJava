package com.example1;

public class Bank {
	static int accno;
	int balance;
	String name;

	void display() {
		System.out.println("accno " + accno);
		System.out.println("balance" + balance);
		System.out.println("name " + name);

	}

	{
		accno++;

	}

	public static void main(String[] args) {
		Bank b = new Bank();
		accno = 123;
		b.balance = 10000;
		b.name = "nandu";
		b.display();

		Bank b1 = new Bank();
		b1.name = "nandan";
		b1.balance = 5000;
		b1.display();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		Bank b4 = new Bank();

	}

}
