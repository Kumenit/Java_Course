package pack;
public class chaindx{
	public static void meth()throws ArithmeticException
	{
		ArithmeticException a=new ArithmeticException();
		ArrayIndexOutOfBoundsException i=new ArrayIndexOutOfBoundsException();
		a.initCause(i);
	NullPointerException c=new NullPointerException();
	i.initCause(c);
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
			Throwable d=e.getCause();
			System.out.println("orginal case of the first:"+d.getCause());
		}
	}
}