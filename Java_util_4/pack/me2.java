package pack;
import java.util.*;
public class me2 extends TimerTask{
	static int p=0;
	public void run()
	{
		disp();
	}
	public void disp()
	{
		boolean b=false;
		System.out.println("time:"+(new Date()).getTime());
		p+=1000;
		if(p==10000)
			b=this.cancel();
		if(b=true)
		{
	    System.out.println("the task has been canceld");
		}
	}
}