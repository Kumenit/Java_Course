package pack;
public class lik extends Thread{
	boolean flag=false;
	public void run()
	{
		try{
			for(int i=0;i<=10;i++)
			{
				System.out.println("inside like i="+i);
				Thread.sleep(500);
				synchronized(this)
				{
					while(flag)
						this.wait();
				}
			}
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
	void suspendt()
	{
		flag=true;
	}
	synchronized void resumet()
	{
		flag=false;
		notify();
	}
}