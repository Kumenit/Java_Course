class best{
	int id;
	void passbyrefferance(best s)
	{
		s.id=12;
	}
	void passbyvalue(int i)
	{
		i=104;
	}
}
class pass{
	public static void main(String[] args)
	{
		best b1=new best();
		b1.id=13;
		System.out.println("id="+b1.id);
		b1.passbyrefferance(b1);
		System.out.println("after id="+b1.id);
		best b2=new best();
		b2.id=5;
		System.out.println("id="+b2.id);
		b2.passbyvalue(b1.id);
		System.out.println("after id="+b2.id);
	}
}
		