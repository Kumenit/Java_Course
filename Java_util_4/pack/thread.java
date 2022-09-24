package pack;
import java.util.*;
public class thread extends Thread{
	List<String> l;
	public thread(List<String> l)
	{
		this.l=l;
	}
	public void run()
	{
		add();
	}
	public void add()
	{
		l.add("kome");
		l.add("sofe");
		l.add("desta");
		l.add("genet");
	}
}