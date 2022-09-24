package pack;
public class q<T,V extends Number> extends o<T>{
	V v;
	public q(T t,V v)
	{
		super(t);
		this.v=v;
	}
  public void disp()
  {
	  System.out.println("value:"+super.getClass().getName());
	  System.out.println("value:"+v.getClass().getName());
  }
}