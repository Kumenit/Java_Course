package pack2;
public class doctor{
	int docid;
	String docname;
	String docaddress;
	public doctor(int id,String n,String a)
	{
		docid=id;
		docname=n;
	docaddress=a;
	}
	public void displayinfo()
	{
		System.out.println("doctor details");
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
}