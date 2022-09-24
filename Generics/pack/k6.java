package pack;
public class k6<T>{
	T t;
	public k6(T t)
	{
		this.t=t;
	}
	public void disp(k6<?> x)
	{
	  System.out.println("value:"+t);
	  if(t==x)
	  {
		  System.out.println("same");
	  }
	  else
		  System.out.println("not same");
	}
}