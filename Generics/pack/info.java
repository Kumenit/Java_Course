package pack;
public class info{
	public doc d;
	public <T extends doc> info(T d)
	{
		this.d=d;
	}
	public void display()
	{
		System.out.println("name:"+d.getClass().getName());
	}
	
}