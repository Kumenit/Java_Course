package pack;
public class like{
	public void display()
	{
		System.out.println("i am kome");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			System.out.println("the class has been interrupted");
		}
		System.out.println("like");
		System.out.println("the best thing");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("gameing");
	}
}