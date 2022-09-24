package pack;
import java.util.*;
public class doc implements Comparator<doc>{
	int docid;
	String docname;
	String docaddress;
	public doc()
	{
	}
	public doc(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	public String toString()
	{
		return "docid"+docid+"docname"+docname+"docaddress:"+docaddress;
	}
	public int compare(doc o1,doc o2)
	{
		doc d1=o1;
		doc d2=o2;
		if(d1.docid==d2.docid)
			return 0;
		else if(d1.docid > d2.docid)
			return 1;
		else return -1;
	}
}