package pack;
public class array1{
	public static void main(String[] args)
	{
		int a[];
		a=new int[20];
		for(int i=0;i<20;i++)
		{
			System.out.println(a[i]+"\t");
		}
		for(int i=0;i<20;i++)
			a[i]=i;
		for(int i=0;i<20;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int ln=a.length;
		System.out.println("length:"+ln);
	}
}