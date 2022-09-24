package pack;
public class figure <T extends quadrilateral> implements s<T>{
	T t;
	public figure(T t)
	{
		this.t=t;
	}
	public T display()
	{
		return t;
	}
}