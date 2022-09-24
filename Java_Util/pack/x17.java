package pack;
import java.util.*;
public class x17{
	public static void main(String[] args)
	{
		cricketer c=new cricketer("kome",1,2,3);
		cricketer c1=new cricketer("sofe",4,5,6);
		cricketer c2=new cricketer("desta",7,8,9);
		LinkedList<cricketer> ll=new LinkedList<cricketer>();
		ll.add(c);
		ll.add(c1);
		ll.add(c2);
    Iterator<cricketer> i=ll.iterator();
	while(i.hasNext())
		System.out.println(i.next().tostring());
	}
}