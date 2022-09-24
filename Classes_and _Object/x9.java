class game{
	String a;
	void passbyrefferance(game g)
	{
		g.a="game";
	}
	void passbyvalue(String a)
	{
		a="best";
	}
}
class x9{
	public static void main(String[] args)
	{
		game g1=new game();
		g1.a="love";
		System.out.println("a="+g1.a);
		g1.passbyrefferance(g1);
		System.out.println("after a="+g1.a);
		game g2=new game();
		g2.a="like";
		System.out.println("a="+g2.a);
		g2.passbyvalue(g2.a);
		System.out.println("after a="+g2.a);
	}
}
		