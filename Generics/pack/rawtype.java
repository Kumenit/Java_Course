package pack;
public class rawtype{
	public static void main(String[] args)
	{
		Double a=new Double(123.45);
		a<Double> ag1=new a<Double>(a);
		a<Character> ag2=new a<Character>('l');
		double d=(Double)ag1.get();
		System.out.println("d="+d);
		ag1=ag2;
		d=(Double)ag1.get();
		System.out.println(d);
		a<Boolean> ag3=new a<Boolean>(false);
		ag3=ag1;
		boolean b1=ag3.get();
		System.out.println(b1);
	}
}