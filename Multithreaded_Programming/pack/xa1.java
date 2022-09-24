package pack;
public class xa1 implements Runnable{
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