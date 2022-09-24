package pack;
public class chaind{
	public static void meth()throws ArithmeticException
	{
		ArithmeticException a=new ArithmeticException();
		ArrayIndexOutOfBoundsException i=new ArrayIndexOutOfBoundsException();
		Throwable t=a.initCause(i);
		System.out.println("throwable:"+t);
		throw a;
	}
	public static void main(String[] args)
	{
		try{
			meth();
		}catch(ArithmeticException e)
		{
			System.out.println("cauhat:"+e);
			System.out.println("orginal case :"+e.getCause());
		}
	}
}