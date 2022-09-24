class shortcircuit{
	public static void main(String[] args)
	{
		int a=50;
		int b=13;
	    if(a+b>60&&a-b<40)
			System.out.println("it is ok");
		if((a*b<100)||(b>0))
			System.out.println("it is not ok");
	}
}