package pack;
public class b extends Thread{
	public void run()
	{
		for(int j=0;j<=10;j++)
		{
			try{
				System.out.println("j="+j);
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{}
		}
	}
}
