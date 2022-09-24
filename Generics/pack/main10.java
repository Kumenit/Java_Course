package pack;
public class main10{
	public static <T,V> void get(T t,V v,int i)
	{
		System.out.println("value:"+t.getClass().getName());
		System.out.println("value:"+v.getClass().getName());
		System.out.println("vlaue:"+i);
	}
	public static void main(String[] args)
	{
		m<Double,Integer> x=new m<Double,Integer>(12.3,123);
		Integer i=new Integer(120);
		Double d=new Double(12.0);
		get(d,i,12);
	}
}