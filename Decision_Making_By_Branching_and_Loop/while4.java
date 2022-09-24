class while4{
	public static void main(String[] args)
	{
		int a[]={12,13,14,15,25,30,32};
		int i=0;
		int j=a.length-1;
		while(++i < --j);
		System.out.println("the median is"+a[i]);
	}
}