package batch70_class;

interface In1{
    void add();
    void hello();
    default void subtract()
    {
    	System.out.println("this is the method for subtraction");
    }
}

interface In2{
    void add();
    void hi();
   
    default void multiply()
    {
    	System.out.println("this i the method for multiplication");
    }
}

interface In3 extends In1,In2{

}

class ClassIn implements In3{

    @Override
    public void add() {
        System.out.println("add something here");
    }

    @Override
    public void hello() {
        System.out.println("hello method");
    }

    @Override
    public void hi() {
        System.out.println("hi method");
    }

	
}

public class TestInterface {
	public static void main(String args[])
	{
		In3 obj1 = new ClassIn();
		obj1.add();
		obj1.hello();
		obj1.hi();
		obj1.subtract();
		obj1.multiply();
		
	}

}