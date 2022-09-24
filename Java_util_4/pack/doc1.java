package pack;
import java.util.*;
public class doc1 implements Comparator<doc1>{
	int docid;
	String docname;
	String docaddress;
	public doc1()
	{
	}
	public doc1(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	public void disp()
	{
		System.out.println("id"+docid+"name"+docname+"adress"+docaddress);
	}
	public int compare(doc1 o,doc1 o1)
	{
		doc1 d=o;
		doc1 d1=o1;
		if(d.docid==d1.docid)
			return 0;
		else if (d.docid<d1.docid)
			return 1;
		else return -1;
	}
}