class doc{
	int i;
	int j;
	public doc(int ii,int jj)
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
class like extends doc{
	int k;
	public like(int ii,int jj,int kk)
	{
		super(ii,jj);
		k=kk;
	}
	public void disp()
	{
		super.disp();
		System.out.println("k:"+k);
	}
}
class x7{
	public static void main(String[] args)
	{
		doc d;
		like a=new like(1,2,3);
		d=a;
		System.out.println("details");
		d.disp();
	}
}