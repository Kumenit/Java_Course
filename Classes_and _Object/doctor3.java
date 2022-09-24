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
class doctor3{
	public static void main(String[] args)
	{
		int i;
		String n;
		String a;
		
		doctor d1=new doctor();
		d1.set(1,"abey","bola");
		i=d1.docid();
		n=d1.docname();
		a=d1.docaddress();
        System.out.println("details of doctor\n");
		
		System.out.println("id:"+i);
		System.out.println("name:"+n);
		System.out.println("address:"+a);
		
		doctor d2=new doctor();
		d2.set(2,"genet","garment");
		
		i=d2.docid();
		n=d2.docname();
		a=d2.docaddress();
		
		System.out.println("id:"+i);
		System.out.println("name:"+n);
		System.out.println("address:"+a);
		
	}
}