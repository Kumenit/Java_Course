package pack;
public class suspendresume2{
	public static void main(String[] args)
	{
		lik l=new lik();
		best b=new best();
		
		l.start();
		b.start();
		
		try{
			Thread.sleep(1000);
			l.suspendt();
			System.out.println("suspended the first thread");
			Thread.sleep(1000);
			System.out.println("resuming the first thread");
			l.resumet();
			Thread.sleep(1000);
			b.suspendt();
			System.out.println("suspended the second thread");
			Thread.sleep(1000);
			System.out.println("resuming the second thread");
			b.resumet();
			l.join();
			b.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main thread");
	}
}