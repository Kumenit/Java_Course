package pack;
public class x13{
	public static void meth()
	{
		try{
			throw new NumberFormatException();
		}catch(NumberFormatException e)
		{
			throw new NumberFormatException();
		}
	}
	public static void main(String[] args)
	{
		try{
			meth();
		}catch(NumberFormatException e)
		{
			System.out.println("handling NumberFormatException");
		}
	}
}