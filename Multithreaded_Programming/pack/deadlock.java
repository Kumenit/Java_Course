package pack;
public class deadlock{
	public static void main(String[] args)
	{
		X x=new X();
		Y y=new Y();
		
		mythread1 m=new mythread1(y,x);
		mythread3 m2=new mythread3(y,x);
		
		m.start();
		m2.start();
		m.setName("me");
		m2.setName("you");
		try{
			m.join();
			m2.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("the main exiting");
	}
}