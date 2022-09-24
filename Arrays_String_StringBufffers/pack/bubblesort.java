package pack;
public class bubblesort{
	public void Sort(int a[])
	{
		int n=a.length;
		int j,pass,hold;
		boolean switched=true;
		
		for(int t=0;t<a.length;t++)
		  System.out.println(a[t]+"\t");
	      System.out.println();
		  
		for(pass=0;pass<n-1 && switched==true;pass++)
		{
			switched=false;
			for(j=0;j<n-pass-1;j++)
				if(a[j]>a[j+1])
				{
					switched=true;
					hold=a[j];
					a[j]=a[j+1];
					a[j+1]=hold;
				}
				if(switched==true)
				{
					for(int t=0;t<a.length;t++)
						System.out.println(a[t]+"t");
					System.out.println();
				}
		}
	}
}