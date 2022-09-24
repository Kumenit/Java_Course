package pack2;
public class y{
	private static int i=1;
	private static double j=128.76;
	private static char c='m';
	public static void display()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("c="+c);
	}
	public static int add(int a,int b)
	{
		return(a+b);
	}
	public static int sub(int a,int b)
	{
		return(a-b);
	}
	public static int mult(int a,int b)
	{
		return(a*b);
	}
	public static int div(int a,int b)
	{
		return(a/b);
	}
}