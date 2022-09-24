package pack;
public class gmethod{
	public static <T,V extends T> String get(T t,V v)
	{
		return ("class-name of first object is"+t.getClass().getName()+"and the class-name of the second object is"+v.getClass().getName());
	}
	public static void main(String[] args)
	{
		doc d1=new doc(1,"kome","cmc");
		doc d2=new doc(2,"sofe","bole");
		System.out.println(get(d1,d2));
		pdoc d3=new pdoc(3,"like","me",12,13,24);
		System.out.println(get(d1,d3));
	}
}