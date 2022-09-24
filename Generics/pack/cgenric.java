package pack;
public class cgenric{
	public static void main(String[] args)
	{
		Integer i=new Integer(120);
		Character c=new Character('m');
		Boolean b=new Boolean(true);
		c<Integer,Character,Boolean> s=new c<Integer,Character,Boolean>(i,c,b);
		s.display();
		c<Character,Double,String>n=new
		c<Character,Double,String>('k',12.3,"game");
		n.display();
	}
}