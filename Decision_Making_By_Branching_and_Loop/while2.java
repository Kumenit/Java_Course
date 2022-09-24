class while2{
	public static void main(String[] args)
	{
		String s=null;
		int i=1;
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=dr.readLine();
		}catch(Exception e){}
		double d=Double.parseDouble(s);
		while(i<d)
		{
			i++;
			sum=sum+i;
		}
		double avg=(double)sum/25;
		System.out.println("the sum of the first 25 number is:"+sum);
		System.out.println("the avrage is:"+avg);
	}
}
			
			