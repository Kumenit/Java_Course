package pack;
public class o<T>{
	T t;
	public o(T t)
	{
		this.t=t;
	}
	public void disp()
	{
		System.out.println("value:"+t.getClass().getName());
	}
}