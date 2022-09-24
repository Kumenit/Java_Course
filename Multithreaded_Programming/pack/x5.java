package pack;
public class x5{
	public static void main(String[] args)
	{
		a x=new a();
		b y=new b();
		
		x.start();
		y.start();
		
		try{
			x.join();
			y.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main thread");
	}
}