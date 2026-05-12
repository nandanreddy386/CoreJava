package batch70_class;

public class TestEncapsulation1 {
	

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setName("mavyan");
		b.setBalance(100000);
		System.out.println(b.getName());
		System.out.println(b.getBalance());
		

	}

}
