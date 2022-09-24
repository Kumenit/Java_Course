class doctor{
	int docid;
	String docname;
	String docaddress;
	
	doctor()
	{
		docid=1;
		docname="kome";
		docaddress="4 kilo";
	}
	void display()
	{
		System.out.println("id="+docid);
		System.out.println("name="+docname);
		System.out.println("address="+docaddress);
	}
	int docid()
	{
		return docid;
	}
	String docname()
	{
		return docname;
	}
	String docaddress()
	{
		return docaddress;
	}
	}
class doctor9{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		System.out.println("details of doctor\n");
		d1.display();
	}
}