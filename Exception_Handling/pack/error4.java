package pack;
public class error4{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int k,i;
		for(i=-1;i<a.length;i++)
		{
			try{
				a[i]=i;
				System.out.println("a[i]="+a[i]);
				k=i/(9-i);
				System.out.println("k="+k);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of bounds");
			}
			catch(ArithmeticException e)
			{
				System.out.println("canot divide by 0");
			}
			catch(ArrayStoreException e)
			{
				System.out.println("only int can  be stored in the array");
			}
			catch(Exception e)
			{
			System.out.println("exception superclass");
			}
		}
	}
}