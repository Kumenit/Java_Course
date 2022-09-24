package pack;
public class game extends Thread{
	like c;
	public void setValue(like c)
	{
		this.c=c;
	}
	public void run()
	{
		synchronized(c)
		{
		c.display();
		}
	}
}