package pack;
public class test<T extends StringBuffer>{
	T t;
	public test(T t)
	{
		this.t=t;
	}
	public void s()
	{
		System.out.println(t.charAt(2));
	}
}