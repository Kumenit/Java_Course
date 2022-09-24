package pack;
public class error8{
	public static void meth()
	{
		System.out.println("indide meth() method");
		System.out.println("this method throws exception");
		throw new ArithmeticException();
	}
	public static void main(String[] args)
	{
		System.out.println("inside main method");
		System.out.println("calling meth()...");
		meth();
	}
}