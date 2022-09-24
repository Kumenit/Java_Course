package pack;
public class selectshort{
	public void Sort(int a[])
	{
		int i,j;
		int temp,index;
		for(i=0;i<a.length;i++)
			System.out.println(a[i]+"\t");
			System.out.println();
			
		for(i=0;i<a.length-1;i++)
		{
			index=i;
			
			for(j=i+1;j<a.length;j++)
			{
				if(a[j] <a[index])
					index=j;
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			for(int t=0;t<a.length;t++)
				System.out.println(a[t]+"\t");
			    System.out.println();
		}
	}
}