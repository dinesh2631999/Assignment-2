// constructor overloading

public class Constructor5 {
	
	//member variable
	
	String name;
	
	// no arg constructor
	Constructor5()
	{
		name="java";
	}
	
	// parameterized constructor
	Constructor5(String n)
	{
		name=n;
	}
	
	//member function or method
	public void printData()
	{
		System.out.println("the language is = " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor5 obj = new Constructor5();
		//single arg parameterized constructor
		Constructor5 obj1 = new Constructor5("phython");
		
		obj.printData();
		obj1.printData();
		
	}

}
