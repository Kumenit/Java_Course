package pack;
public class x17{
	public static void meth()
	{
		NumberFormatException n=new NumberFormatException();
		ArrayIndexOutOfBoundsException a=new ArrayIndexOutOfBoundsException();
		Throwable t=n.initCause(a);
		throw n;
	}
	public static void main(String[] args)
	{
		try{
			meth();
		}catch(NumberFormatException e)
		{
			System.out.println("first:"+t);
			System.out.println("get cause:"+e.getCause());
			System.out.println("handling NumberFormatException");
			System.out.println();
		}
	}
}
	