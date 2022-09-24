package pack;
public class x2<T>{
	T t;
	public x2(T t)
	{
		this.t=t;
	}
   public String get()
   {
	   return t.getClass().getName();
   }
}