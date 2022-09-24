package pack;
public class bgenric{
	public static void main(String[] args)
	{
		Integer i=new Integer(120);
		b s=new b(i);
		int l=(Integer)s.get();
		System.out.println("int l="+l);
		Character c=new Character('k');
		b n=new b(c);
		char e=(Character)n.get();
		System.out.println("char e="+e);
		s=n;
		l=(Integer)s.get();
		System.out.println("int ll="+l);
	}
}