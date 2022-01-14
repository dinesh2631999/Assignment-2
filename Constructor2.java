// no-argument constructor with private access specifier

public class Constructor2 {
	
	//member variable
	
	int n;
	
	//  constructor which specified as private 
	// then the constructor cannot be able to access from outside the class
	
	public Constructor2() 
	{
	 System.out.println("No argument constructor");
	 n=4;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructor is directly involked due to obj creation
        Constructor2 s = new Constructor2();
        System.out.println("the no is "+ s.n);
	}

}
