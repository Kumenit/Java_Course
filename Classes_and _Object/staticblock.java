class staticblock{
	static String s1="ethiopia";
	static String s2;
	static{
		System.out.println("starting string block");
		s2=s1+"is my country";
		int i=100;
		System.out.println("exiting static block...");
	}
public static void main(String[] args)
{
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
	//System.out.println("i="+i);
}
}
	