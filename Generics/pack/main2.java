package pack;
public class main2{
	public static void main(String[] args)
	{
		Integer i=new Integer(120);
		k x=new k(i);
		int t=(Integer)x.get();
		System.out.println("value t:"+t);
		Character c=new Character('k');
		k x2=new k(c);
		x=x2;
		t=(Integer)x.get();
		System.out.println("value:"+t);
	}
}