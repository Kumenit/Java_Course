package pack;
public class Y{
	public synchronized void method1(X x)
	{
		String t=Thread.currentThread().getName();
		System.out.println("thread "+t+"has enterd method1() of y");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(t+"trying to call x.method2()..");
		x.method2();
	}
	public synchronized void method2()
	{
		System.out.println("inside method2()");
	}
}
			