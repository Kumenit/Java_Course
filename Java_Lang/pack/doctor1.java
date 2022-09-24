package pack;
public class doctor1 implements Cloneable{
	private int docid;
	private String docname;
	private String docaddress;
	public doctor1(int docid,String docname,String docaddress)
	{
		this.docid=docid;
		this.docname=docname;
		this.docaddress=docaddress;
	}
	public void disp()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
	public Object clone()
	{
		try{
			return super.clone();
		}catch(CloneNotSupportedException c)
		{
			System.out.println("cloning is not sported");
			return this;
		}
	}
	public doctor1 myclone()
	{
		try{
			return (doctor1)super.clone();
		}catch(CloneNotSupportedException c)
		{
			System.out.println("cloning is not sported");
			return this;
		}
	}
}