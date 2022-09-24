package pack;
public class y3<T,V extends Number> extends x2<T>{
	V v;
	public y3(T t,V v)
	{
		super(t);
		this.v=v;
	}
	public String get()
	{
		String s1=super.get();
		String s2=v.getClass().getName();
		String s="the super class:"+s1+"\n"+"the subclass :"+s2;
		return s;
	}
}