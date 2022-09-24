package pack;
import java.util.*;
public class treesat3{
	public static void main(String[] args)
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("india");
		t.add("usa");
		t.add("ethio");
		t.add("england");
		t.add("sweden");
		t.add("Russia");
		System.out.println("content of tree set:"+t);
		SortedSet<String> ss=t.headSet("india");
		System.out.println("less thsn india:"+ss);
		ss=t.tailSet("india");
		System.out.println("gretr than india:"+ss);
		NavigableSet<String> ns=t.headSet("india",true);
		System.out.println("less than or equal to india:"+ns);
		ns=t.tailSet("india",false);
		System.out.println("gretr than or equal to:"+ns);
		ns=t.descendingSet();
		System.out.println("revers order:"+ns);
		ss=t.subSet("ethio","Russia");
		System.out.println("from e to r:"+ss);
		ns=t.subSet("ethio",false,"Russia",true);
		System.out.println("from e to r:"+ns);
	}
}