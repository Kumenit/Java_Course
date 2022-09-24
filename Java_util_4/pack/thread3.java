package pack;
import java.util.*;
public class thread3 extends Thread{
	Map<String,Integer> l;
	public thread3(Map<String,Integer> l)
	{
		this.l=l;
	}
	public void run()
	{
		put();
	}
	public void put()
	{
		l.put("kome",1);
		l.put("sofe",2);
		l.put("desta",3);
		l.put("genet",4);
	}
}