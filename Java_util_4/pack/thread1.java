package pack;
import java.util.*;
public class thread1 extends Thread{
	List<String> l;
	public thread1(List<String> l)
	{
		this.l=l;
	}
	public void run()
	{
		disp(l);
	}
	public void disp(List<String> l)
	{
		synchronized(l){
			Iterator<String> i=l.iterator();
			while(i.hasNext())
				System.out.println(i.next()+"\t");
		}
	}
}