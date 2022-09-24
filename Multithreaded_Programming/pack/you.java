package pack;
public class you extends Thread{
	public void run()
	{
		try{
			for(int j=0;j<=10;j++)
			{
				System.out.println("j="+j);
				Thread.sleep(500);
			}
		}catch(Exception e)
		{}
		
	}
}