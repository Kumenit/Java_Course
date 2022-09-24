package pack;
public class errorx{
	public static void main(String[] args)
	{
		System.out.println("hi there");
		int a=0;
		int b=100;
		try{
		b=b/a;
		System.out.println("b=:"+b);
		}catch(ArithmeticException e)
		{
			System.out.println("undifined");
		}
	}
}