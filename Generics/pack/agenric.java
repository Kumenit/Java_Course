package pack;
public class cgenric{
	public static void main(String[] args)
	{
		Integer i=new Integer(120);
		Character c=new Character('me');
		Boolean b=new Boolean(true);
		c<Integer,Character,Boolean> s=new c<Integer,Character,Boolean>(i,c,b);
		s.display();
		a<Character,Double,Byte> n=new a<Character,Double,Byte>('ke',12.3,4);
		n.display();
	}
}