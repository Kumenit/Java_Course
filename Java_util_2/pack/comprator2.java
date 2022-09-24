package pack;
import java.util.*;
public class comprator2{
	public static void main(String[] args)
	{
		
		employee1 e1=new employee1(1,"kome","cmc");
		employee1 e2=new employee1(2,"sofe","22");
		employee1 e3=new employee1(3,"desta","bole");
		employee1 e4=new employee1(4,"genet","garment");
		TreeMap<Double,employee1> tm=new TreeMap<Double,employee1>(new employee1());
		tm.put(new Double(e4.empid),e4);
	    tm.put(new Double(e3.empid),e3);
		tm.put(new Double(e2.empid),e2);
		tm.put(new Double(e1.empid),e1);
		System.out.println(tm);
		
	}
}