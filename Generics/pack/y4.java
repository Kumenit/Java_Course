package pack;
public class y4<T extends Number> extends x4{
	T t;
	public y4(Integer i,T t)
	{
		super(i);
		this.t=t;
	}
	public String get()
	{
		String s1=super.get();
		String s2=t.getClass().getName();
		String s="the super class:"+s1+"\n"+"the subclass :"+s2;
		return s;
	}
	public void disp()
	{
		System.out.println("i="+i);
		System.out.println("d="+t);
	}
}