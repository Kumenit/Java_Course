package pack;
public class mythread1 extends Thread{
	Y y;
	X x;
	public mythread1(Y y,X x)
	{
		this.y=y;
		this.x=x;
	}
	public void run()
	{
		x.method1(y);
	}
}
	