package pack;
public class error1{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		for(int i=-1;i<a.length;i++)
		{
			try{
			a[i]=i;
			System.out.println(a[i]+" ");
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index is out of bounds");
			}
		}
	}
}