package pack;
public class thread2{
	public static void main(String[] args)
	{
		Thread m=new Thread(new mythread());
		Thread n=new Thread(new mythread2());
		m.start();
		n.start();
		System.out.println("that is the ending...");
	}
}