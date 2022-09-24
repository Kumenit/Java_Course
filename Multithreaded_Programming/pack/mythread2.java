package pack;
public class mythread2 implements Runnable{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			if(j%2!=0)
			{
				System.out.println("j="+j);
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