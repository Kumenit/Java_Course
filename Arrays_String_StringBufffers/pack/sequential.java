package pack;
public class sequential{
	public void search(int k,int a[])
	{
		int i;
		boolean f=false;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.println("the number"+k+"is inside array and it's position is:"+i);
				f=true;
			}
			if(f==true)break;
		}
			if(f==false)
			{
				System.out.println("the number"+k+"is not inside the array");
			}
	}
}