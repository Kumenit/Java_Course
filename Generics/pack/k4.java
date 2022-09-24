package pack;
public class k4<T,V>{
	T t;
	V v;
	public k4(T t,V v)
	{
		this.t=t;
		this.v=v;
	}
	public void disp()
	{
	  System.out.println("value:"+t.getClass().getName());
	   System.out.println("value:"+v.getClass().getName());
	}
}