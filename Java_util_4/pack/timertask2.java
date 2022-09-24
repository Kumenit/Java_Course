package pack;
import java.util.*;
public class timertask2{
	public static void main(String[] args)
	{
		int d=5000;
		int p=1000;
		Timer t=new Timer();
		me2 m=new me2();
		System.out.println("the thing will apper after 5..");
		t.schedule(m,d,p);
		try{
			Thread.sleep(15000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		t.cancel();
	}
}