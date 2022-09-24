package pack;
public class threadx1{
	public static void main(String[] args)
	{
		firstthread f=new firstthread();
		secthread s=new secthread();
		f.setPriority(Thread.NORM_PRIORITY+5);
		s.setPriority(Thread.NORM_PRIORITY-4);
		f.start();
	s.start();
		try{
			f.join();
			s.join();
		}catch(InterruptedException e)
		{
			System.out.println("the thread has been interrupted");
		}
		System.out.println("getName:"+f.getName());
		System.out.println("f priority:"+f.getPriority());
		System.out.println("s priority:"+s.getPriority());
		System.out.println("activeCount:"+Thread.activeCount());
		
		System.out.println("that is the ending...");
	}
}