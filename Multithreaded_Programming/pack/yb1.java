package pack;
public class yb1 implements Runnable{
	public void run()
	{
		System.out.println("kumenit desta");
	try{
		Thread.sleep(2000);
	}catch(InterruptedException e)
	{
		System.out.println(e.getMessage());
	}
	}
}	
