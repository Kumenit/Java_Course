package pack;
public class x3{
	public static void main(String[] args)
	{
		xa a=new xa();
		yb b=new yb();
		
		a.setPriority(Thread.NORM_PRIORITY+4);
		b.setPriority(Thread.NORM_PRIORITY-4);
		System.out.println("x priority:"+a.getPriority());
		System.out.println("y priority:"+b.getPriority());
		a.start();
		b.start();
		try{
			a.join();
			b.join();
		}catch(InterruptedException e)
		{}
		System.out.println("exiting main thread");
	}
}