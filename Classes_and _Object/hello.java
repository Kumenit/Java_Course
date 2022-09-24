class hello{
	static String i="tokyo ghoul";
	static String j;
	static{
	      System.out.println("statrting the value");
		  j=i+"s1&s2";
		  System.out.println("exiting the value");
	}
	public static void main(String[] args)
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}