class doctor{
	double docid;
	String docname;
	String docaddress;
	
	void display()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
}
class doctor1{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		d1.docid=1;
		d1.docname="sofe";
		d1.docaddress="cmc";

		doctor d2=new doctor();
		d2.docid=2;
		d2.docname="kome";
		d2.docaddress="congo";
		
		System.out.println("details of doctor\n");
		
		d1.display();
		System.out.println();
		d2.display();
	}
}