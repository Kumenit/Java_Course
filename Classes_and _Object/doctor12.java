class doctor{
	int docid;
	String docname;
	String docaddress;
	doctor(int id,String n,String a)
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
	int docid(){
		return docid;
	}
	String docname()
	{
		return docname;
	}
	String docaddress(){
		return docaddress;
	}
}
class doctor12{
	public static void main(String[] args)
	{
		int i;
		String n;
		String a;
		
		doctor d1=new doctor(1,"sofe","bate");
		i=d1.docid();
		n=d1.docname();
		a=d1.docaddress();
        System.out.println("details of doctor\n");
		d1.display();
		System.out.println();
		
		doctor d2=new doctor(2,"kome","house");
		
		i=d2.docid();
		n=d2.docname();
		a=d2.docaddress();
		d2.display();
	}
}