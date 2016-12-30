package check;
class one
{
	
	one()
	{
		System.out.println("Constructor superclass");
	}
	
}
class two extends one
{

	two()
	{
		System.out.println("Constructor subclass");
	}
	public static void main(String args[])
	{
		two a = new two();
		
	}
}