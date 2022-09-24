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
	doctor dublicat()
	{
		doctor temp=new doctor();
		temp.docid=docid;
		temp.docname=docname;
		temp.docaddress=docaddress;
		return temp;
	}
	void display()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
}
class doctor15{
	public static void main(String[] args)
	{
		 System.out.println("details of doctor\n");
		doctor d1=new doctor();
		d1.set(1,"abey","bola");
		d1.display();
		
		doctor d2=new doctor();
		d2=d1.dublicat();
		System.out.println();
		d2.display();
	}
}
		
		
		
		
	