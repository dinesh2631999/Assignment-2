//simple no-argument constructor

public class Constructor1 {
	
	//member variable
	
	String name;
	
	// no argument constructor
	
	public Constructor1() 
	{
	 System.out.println("No argument constructor");
	 name ="Dinesh";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Constructor1 s = new Constructor1();
        System.out.println("my name is "+ s.name);
	}

}
