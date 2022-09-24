class doctor{
	double docid;
	String docname;
	String docaddress;
}
class doctordemo{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		d1.docid=1;
		d1.docname="sofe";
		d1.docaddress="cmc";
		
		System.out.println("doctor detail\n");
		System.out.println("id:"+d1.docid);
		System.out.println("name:"+d1.docname);
		System.out.println("address:"+d1.docaddress);
		
		doctor d2=new doctor();
		d2.docid=2;
		d2.docname="kome";
		d2.docaddress="congo";
		
		System.out.println();
		System.out.println("id:"+d2.docid);
		System.out.println("name:"+d2.docname);
		System.out.println("address:"+d2.docaddress);
	}
}