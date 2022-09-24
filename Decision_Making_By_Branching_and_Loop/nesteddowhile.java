class nesteddowhile{
	public static void main(String[] args)
	{
		int i=1,j;
		do
		{
			j=1;
			do
			{
				int k=i*j;
				System.out.println(k+" ");
				j++;
			}while(j<=10);
			i++;
			System.out.println();
		}while(i<=10);
	}
}