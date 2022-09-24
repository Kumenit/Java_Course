package pack;
public class thread8{
	public static void main(String[] args)
	{
		like c=new like();
		game g1=new game();
		game g2=new game();
		g1.setValue(c);
		g2.setValue(c);
		g1.start();
		g2.start();
		try{
			g1.join();
			g2.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
		