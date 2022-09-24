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
	
	void detect(doctor d)
	{
		if(docid==d.docid()){
			System.out.println("id are the same");
		}
		else{
			System.out.println("id are not same");
		}
		if(docname.equals(d.docname()))
		{
			System.out.println("name are the same");
		}
		else{
			System.out.println("name are not same");
		}
		if(docaddress.equals(d.docaddress()))
		{
			System.out.println("address are the same");
		}
		else{
		System.out.println("address are not the same");
		}
	}
		
}
class doctor5{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		System.out.println("details of doctor\n");
		d1.set(1,"sofe","garment");
		doctor d2=new doctor();
		d2.set(2,"kome","garment");
		doctor d3=new doctor();
		d3.set(3,"sofe","bola");
		System.out.println("compare d1&d2");
		d1.detect(d2);
		System.out.println();
		d1.detect(d3);
		System.out.println();
		d2.detect(d3);
		
	}
}