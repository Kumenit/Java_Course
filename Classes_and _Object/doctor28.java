class doctor{
	int docid;
	String docname;
	String docaddress;
	doctor(int docid,String docname,String docaddress)
	{
		this.docid=docid;
		this.docname=docname;
		this.docaddress=docaddress;
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
class doctor28{
	public static void main(String[] args)
	{
		int i;
		String n;
		String a;
		
		doctor d1=new doctor(1,"sofe","bate");
		i=d1.docid();
		n=d1.docname();
		a=d1.docaddress();
       System.out.println("id is:"+i);
	   System.out.println("name is:"+n);
	   System.out.println("address is:"+a);
	}
}