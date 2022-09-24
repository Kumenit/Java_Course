package pack;
public class m2<T> implements a1<T>{
	T t;
	public m2(T t)
	{
		this.t=t;
	}
	public void disp()
	{
		System.out.println("value:"+t.getClass().getName());
	}
}