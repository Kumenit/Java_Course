package docpack;
class company{
	String comname;
	String comaddr;
	doctor d;
	public company(String a,String b)
	{
		comname=a;
		comaddr=b;
	}
	public void display(doctor temp)
	{
		d=temp;
		d.displayinfo();
		System.out.println("ditails of company");
		System.out.println("company name:"+comname);
		System.out.println("company address:"+comaddr);
	}
}

		