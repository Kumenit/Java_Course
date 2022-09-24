package pack;
public class secthread extends Thread{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
				System.out.println("j="+j);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					System.out.println("the therad has been interrupted");
				}
			}
		}
	}