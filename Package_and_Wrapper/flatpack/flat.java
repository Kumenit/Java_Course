package flatpack;
public class flat{
	String apartment;
	int flatno;
	int noofbedrooms;
	public flat(String a,int f,int n)
	{
		apartment=a;
		flatno=f;
		noofbedrooms=n;
	}
	public void dipflat()
	{
		System.out.println("apartment number:"+apartment);
		System.out.println("flatno:"+flatno);
		System.out.println("no of bedrooms:"+noofbedrooms);
	}
}