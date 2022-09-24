package pack;
import java.util.*;
public class timertask{
	public static void main(String[] args)
	{
		Timer t=new Timer();
		me m=new me();
		t.schedule(m,5000);
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		t.cancel();
	}
}