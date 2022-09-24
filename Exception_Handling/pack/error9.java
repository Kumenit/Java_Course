package pack;
public class error9{
	public static void meth() throws ArithmeticException
	{
		System.out.println("indide meth() method");
		System.out.println("this method throws exception");
		throw new ArithmeticException();
	}
	public static void main(String[] args)
	{
		try{
		System.out.println("inside main method");
		System.out.println("calling meth()...");
		meth();
		}catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.out.println("handling ArithmeticException method");
		}
	}
}