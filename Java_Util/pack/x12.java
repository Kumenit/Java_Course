package pack;
import java.util.*;
import java.io.*;
public class x12{
	public static void main(String[] args)
	{
		String a="m",b="b",c="c",d="d",e="e",f="f",g="g",h="h";
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("enter 1 string");
			s=br.readLine();
			 a=s.toString();
			System.out.println("enter 2 string");
			s=br.readLine();
			b=s.toString();
			System.out.println("enter 3 string");
			s=br.readLine();
			c=s.toString();
			System.out.println("enter 4 string");
			s=br.readLine();
			 d=s.toString();
			System.out.println("enter 5 string");
			s=br.readLine();
			e=s.toString();
			System.out.println("enter 6 string");
			s=br.readLine();
			 f=s.toString();
			System.out.println("enter 7 string");
			s=br.readLine();
		 g=s.toString();
			System.out.println("enter 8 string");
			s=br.readLine();
			h=s.toString();
		}catch(Exception k)
		{
			System.out.println("wrong input");
		}
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add(a);
		pq.add(b);
		pq.add(c);
		pq.add(d);
		pq.add(e);
		pq.add(f);
		pq.add(g);
		pq.add(h);
		pq.peek();
		System.out.println(pq);
		Iterator<String> i=pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+"\t");
		}
	}
}
		
		
		
		
		
		