package pack;
public class binary{
	public void search(int a[],int k)
	{
		int f=k;
		boolean ff=false;
		int middle=0;
		int first=0;
		int last=a.length-1;
		while((first <=last) & (ff=false))
		{
			middle=(first + last)/2;
if(a[middle]==f)
{
ff=true;
}
else if (a[middle]<f)
{
first=middle+1;
}
else {
last=middle-1;
}
		} 
          if(ff=true)
		  {
		  System.out.println("element"+k+"has been found at position"+middle);
		  }
    else
System.out.println("element"+k+"has not been found");
	}
}	