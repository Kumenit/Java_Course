package pack7;
public class fd{
	public static void main(String[] args)
	{
		Float f1=new Float(20.0f);
		Float f2=new Float(20.5);
		System.out.println("f1="+f1.floatValue());
		System.out.println("is nan:"+Float.isNaN(0.0f/0.0f));
		System.out.println("f1="+f1.isNaN());
		System.out.println("isInfinite:"+Float.isInfinite(1f/0.0f));
		System.out.println("f2="+f2.isInfinite());
		System.out.println("compare:"+Float.compare(20f,30.0f));
		Double d1=new Double(35.5);
		System.out.println("isNaN:"+Double.isNaN(d1));
		System.out.println("isInfinite:"+Double.isInfinite(d1));
	}
}