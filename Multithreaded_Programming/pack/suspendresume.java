package pack;
public class suspendresume{
	public static void main(String[] args)
	{
		me m=new me();
		you y=new you();
		
		m.start();
		y.start();
		try{
			Thread.sleep(1000);
			m.suspend();
			System.out.println("suspended the first ");
			Thread.sleep(1000);
			System.out.println("resumeing the first thread");
			m.resume();
			Thread.sleep(1000);
			y.suspend();
			System.out.println("suspended the second ");
			Thread.sleep(1000);
			System.out.println("resumeing the second thread");
			y.resume();
			m.join();
			y.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main thread");
	}
}

			