package pack;
public class me extends Thread{
	public void run()
	{
		try{
		for(int i=0;i<=10;i++)
		{
			
				System.out.println("i="+i);
				Thread.sleep(500);	
		}
		}catch(Exception e)
			{}
	}
}