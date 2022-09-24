package pack;
public class best extends Thread{
	boolean flag=false;
	public void run()
	{
		try{
			for(int j=0;j<=10;j++)
			{
				System.out.println("inside best j="+j);
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