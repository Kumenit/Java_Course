package pack;
public class ytest<T extends Character>{
	T t;
	public ytest(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return valueOf(t);
	}
}