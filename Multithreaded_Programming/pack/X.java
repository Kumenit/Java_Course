package pack;
public class X{
	public synchronized void method1(Y y)
	{
		String t=Thread.currentThread().getName();
		System.out.println("thread"+t+"has entrerd method1() of class x");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{}
		System.out.println(t+"trying to call y.method()..");
		y.method2();
	}
	public synchronized void method2()
	{
		System.out.println("inside method2() of class x");
	}
}