package pack;
public class producer extends Thread{
	common c;
	public producer(common c)
	{
		this.c=c;
	}
	public void run()
	{
		boolean r=true;
		while(r==true)
		{
			c.producer();
			if(c.s.equals("end"))
			r=false;
		}
	}
}