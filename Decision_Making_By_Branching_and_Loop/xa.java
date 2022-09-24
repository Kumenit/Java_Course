package pack;
public class xa extends Thread{
	public void run()
	{
		System.out.println("my name is");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
	}
}