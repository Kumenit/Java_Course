class scope1{
	public static void main(String[] args)
	{
		int l=60;
		int w=40;
		int area=l*w;
		System.out.println("within outer block");
		System.out.println("variabl area,length and"+" width are defined in outer block");
		System.out.println("area:"+area);
		{
			int pa=2*l+2*w;
			System.out.println("within inner block");
			System.out.println("variabl p"+" defined inner block");
			System.out.println("parameter:"+pa);
		}
		System.out.println("within outer block again");
		System.out.println("variabl p"+" not visble in outer block");
		System.out.println("parameter:"+pa);
	}
}
			