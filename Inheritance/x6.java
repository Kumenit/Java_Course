class x{
	int i;
	int j;
	public x(int ii,int jj)
	{
		i=ii;
		j=jj;
	}
	public void disp()
	{
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}
}
class y extends x{
	int i;
	int j;
	public y(int ii,int jj,int ij,int ji)
	{
		super(ii,jj);
		i=ij;
		j=ji;
	}
	public void disp()
	{
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("i:"+super.i);
		System.out.println("j:"+super.j);
		super.disp();
	}
}
class x6{
	public static void main(String[] args)
	{
		y a=new y(1,2,3,4);
		System.out.println("details");
		a.disp();
	}
}