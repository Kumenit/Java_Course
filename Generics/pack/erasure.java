package pack;
public class erasure{
	public static void main(String[] args)
	{
		x6<Double> x=new x6<Double>(12.34);
		x6<Integer> x1=new x6<Integer>(120);
		x6<Character> x2=new x6<Character>('k');
		System.out.println("value:"+x.getClass().getName());
		System.out.println("value:"+x1.getClass().getName());
		System.out.println("value:"+x2.getClass().getName());
	ytest<Character> y=new ytest<Character>('b');
	System.out.println("value:"+y.getClass().getName());
	}
}
	