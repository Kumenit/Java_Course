package pack;
public class doc extends doctor{
	int o;
	public doc(int id,String n,String a,int o)
	{
		super(id,n,a);
		this.o=o;
	}
	public void disp()
	{
		super.disp();
		System.out.println("now:"+o);
	}
}