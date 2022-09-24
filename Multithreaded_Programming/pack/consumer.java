package pack;
public class consumer extends Thread{
	common c;
	public consumer(common c)
	{
		this.c=c;
	}
	public void run()
	{
		boolean r=false;
		while(r==false)
		{
			c.consume();
			if(c.s.equals("end"));
			r=true;
		}
	}
}