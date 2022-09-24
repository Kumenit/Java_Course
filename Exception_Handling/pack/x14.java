package pack;
public class x14{
	public static void meth()throws NumberFormatException
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