class doctors{
	String docname="kome";
	static class doctor
	{
		static void display()
		{
		// System.out.println("name is:"+docname);
		doctors d1=new doctors();
		String i=d1.docname;
		 System.out.println("name is:"+i);
		}
	}
		public void get()
		{
			doctor.display();
		}
}
class doctor25{
	public static void main(String[] args)
	{
		doctors d2=new doctors();
		d2.get();
	}
}	
		

		
		