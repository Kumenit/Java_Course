package pack;
import java.util.*;
public class set extends Thread{
      Set<String> s;
	public set(Set<String> s)
	{
		this.s=s;
	}
	public void run()
	{
		synchronized(s)
		{
			System.out.println("set:"+s);
		}
	}
}