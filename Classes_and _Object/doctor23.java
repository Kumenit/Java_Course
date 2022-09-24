class doctor{
	private int docid;
	private String docname;
	private String docaddress;
	doctor(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	public int getdocid(){
		return docid;
	}
	public String getdocname()
	{
		return docname;
	}
	public String getdocaddress(){
		return docaddress;
	}
	public int setdocid(int n)
	{
		return docid=n;
	}
	public String setdocname(String a)
	{
		return docname=a;
	}
	public String setdocaddress(String b)
	{
		return docaddress=b;
	}
}
class doctor23{
	public static void main(String[] args)
	{
		int i;
		String n;
		String a;
		 System.out.println("details of doctor\n");
		doctor d1=new doctor(1,"sofe","bate");
		//i=d1.docid;
		//n=d1.docname;
		//a=d1.docaddress;
		i=d1.getdocid();
		n=d1.getdocname();
		a=d1.getdocaddress();
		System.out.println("the value of d1:\n");
		 System.out.println("id="+i);
		  System.out.println("name="+n);
		   System.out.println("address="+a);
		 //change the value
		
		doctor d2=new doctor(2,"kome","house");
		//d2.setdocid=13;
		//d2.setdocname="game"
		//d2.setdocaddress="best";
		i=d2.setdocid(2);
		n=d2.setdocname("sofe");
		a=d2.setdocaddress("bole");
		 System.out.println("id="+i);
		  System.out.println("name="+n);
		   System.out.println("address="+a);
	}
}