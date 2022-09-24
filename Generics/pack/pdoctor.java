package pack;
public class pdoctor extends doctor{
	int basic;
	int da;
	int hra;
	public pdoctor(int id,String n,String a,int b,int d,int h)
	{
		super(id,n,a);
		basic=b;
		da=d;
		hra=h;
	}
}