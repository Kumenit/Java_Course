package pack;
public class c<T,E,V>{
	T t;
	E e;
	V v;
	public c(T t,E e,V v)
	{
		this.t=t;
		this.e=e;
		this.v=v;
	}
	public void display()
	{
		System.out.println("t="+t);
		System.out.println("e="+e);
		System.out.println("v="+v);
	}
}