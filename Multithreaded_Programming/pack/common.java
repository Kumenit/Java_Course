package pack;
import java.io.*;
public class common{
	String s;
	boolean p=false;
	synchronized public void producer()
	{
		if(p==false)
		{
			try{
				wait();
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else{
		System.out.println("enter any string,enter end to exit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		p=true;
		if(!s.equals("end"))
		{
			System.out.println("the producer produced:"+s);
		}
		notify();
		}
	}
	synchronized public void consume()
	{
		if(p==false)
		{
			try{
				wait();
			}catch(InterruptedException e)
			{}
		}
	     else{
		if(!s.equals("end"))
		{
			System.out.println("the consumer consum:"+s);
		}
		p=false;
		notify();
			}
	}
}