package pack;
public class m1{
	Integer i;
	public <T extends Integer> m1(T i)
	{
		this.i=i;
	}
	public void disp()
	{
		System.out.println("value:"+i.getClass().getName());
	}
}