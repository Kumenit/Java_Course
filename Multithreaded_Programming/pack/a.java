package pack;
public class a extends Thread{
	public synchronized void run()
	{
		for(int i=0;i<=10;i++)
		{
			try{
				System.out.println("i="+i);
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{}
		}
	}
}