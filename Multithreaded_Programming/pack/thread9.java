package pack;
public class thread9{
	public static void main(String[] args)
	{
		common c=new common();
		producer p=new producer(c);
		consumer s=new consumer(c);
		p.start();
		s.start();
		try{
			p.join();
			s.join();
		}catch(InterruptedException e)
		{}
		System.out.println("that is ending");
	}
}
		