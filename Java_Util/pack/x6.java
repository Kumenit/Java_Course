package pack;
import java.io.*;
import java.util.*;
public class x6{
	public static void main(String[] args)
	{
		int a=0,b=0,c=0;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("enter 1 number");
			s=br.readLine();
			 a=Integer.parseInt(s);
			System.out.println("enter 2 number");
			s=br.readLine();
			 b=Integer.parseInt(s);
			System.out.println("enter 3 number");
			s=br.readLine();
			c=Integer.parseInt(s);
		}catch(Exception m)
		{
			System.out.println("wrong input");
		}
		LinkedList<Integer> al=new LinkedList<Integer>();
		al.add(a);
		al.add(b);
		al.add(c);
		Iterator<Integer> i=al.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+"\t");
		}
	}
}
			
			
		