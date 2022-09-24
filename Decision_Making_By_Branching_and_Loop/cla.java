class cla{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("no argumrnts");
		}
		else{
			System.out.println("the number of argumrnts are");
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
	}
}