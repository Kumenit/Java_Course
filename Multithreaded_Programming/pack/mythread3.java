package pack;
public class mythread3 extends Thread{
	Y y;
	X x;
	public mythread3(Y y,X x)
	{
		this.y=y;
		this.x=x;
	}
	public void run()
	{
		y.method1(x);
	}
}