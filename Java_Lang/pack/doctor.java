package pack;
import java.util.*;
public class doctor implements RandomAccess,Cloneable{
	int docid;
	String docname;
	String docaddress;
	public int getid()
	{
		return docid;
	}
	public void setid(int docid)
	{
		this.docid=docid;
	}
	public String getname()
	{
		return docname;
	}
	public void setname(String docname)
	{
		this.docname=docname;
	}
	public String getaddress()
	{
		return docaddress;
	}
	public void setaddress(String docaddress)
	{
		this.docaddress=docaddress;
	}
	public doctor()
	{
		docid=1;
		docname="kome";
		docaddress="cmc";
	}
	public doctor(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	public void disp()
	{
		System.out.println("id="+docid);
		System.out.println("name="+docname);
		System.out.println("address="+docaddress);
	}
}
		