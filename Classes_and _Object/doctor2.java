class doctor{
	int docid;
	String docname;
	String docaddress;
	
	void set(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	
	void display()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
}
class doctor2{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		d1.set(1,"abey","bola");

		doctor d2=new doctor();
		d2.set(2,"genet","garment");
		
		System.out.println("details of doctor\n");
		
		d1.display();
		System.out.println();
		d2.display();
	}
}