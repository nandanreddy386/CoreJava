package batch70_class;
import java.util.Scanner;
public class BankAccount {
	private String name;
	private double balance;

	void setName(String name)
	{
		this.name = name;
		
	}
	void setBalance(double balance)
	{
		if(balance>=0)
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("balance can't be negative");
		}
		
	}
	String getName()
	{
		return name;
	}
	double getBalance()	
	{
		return balance;
	}
	


}
