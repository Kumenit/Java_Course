class nestedwhile{
	public static void main(String[] args)
	{
		int i=1,j;
		while(i<=10)
		{
			j=1;
			while(j<=10)
			{
				int k=i*j;
				System.out.println(k+" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}