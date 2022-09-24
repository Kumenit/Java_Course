package pack;
import java.util.*;
public class comparator{
	public static void main(String[] args)
	{
		employee e1=new employee(1,"kome","cmc");
		employee e2=new employee(2,"sofe","22");
		employee e3=new employee(3,"desta","bole");
		employee e4=new employee(4,"genet","garment");
		TreeSet<employee> t=new TreeSet<employee> (new employee());
		t.add(e4);
		t.add(e3);
		t.add(e2);
		t.add(e1);
		Iterator<employee> i=t.iterator();
		while(i.hasNext())
			System.out.println(i.next().tostring()+"\t");
	}
}
		