package pack;
public class x3<T>{
	T t;
	public x3(T t)
	{
		this.t=t;
	}
   public String get()
   {
	   return t.getClass().getName();
   }
}