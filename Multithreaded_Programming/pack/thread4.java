package pack;
public class thread4{
	public static void main(String[] args)
	{
		Thread m=new Thread(new mythread());
		Thread n=new Thread(new mythread2());
		m.start();
		n.start();
		try{
			m.join();
			n.join();
		}catch(InterruptedException e)
		{
			System.out.println("the thread has been interrupted");
		}
		System.out.println("that is the ending...");
	}
}