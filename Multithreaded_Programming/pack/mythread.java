package pack;
public class mythread implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("i="+i);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
				