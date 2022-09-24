package pack;
public class x2b{
	public static void main(String[] args)
	{
		Thread a=new Thread(new xa1());
        Thread b=new Thread(new yb1());
		
		a.start();
		b.start();
		try{
			a.join();
			b.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main thread");
	}
}