class nestedwhile2{
	public static void main(String[] args)
	{
		int i=1,j;
		while(i<=2);
		{
			j=1;
			while(j<=3);
			{
				int k=i+j;
				System.out.println(k+" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}