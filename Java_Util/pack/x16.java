package pack;
import java.io.*;
import java.util.*;
public class x16{
	public static void main(String[] args)
	{
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
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
			System.out.println("enter 4 number");
			s=br.readLine();
			 d=Integer.parseInt(s);
			System.out.println("enter 5 number");
			s=br.readLine();
			e=Integer.parseInt(s);			
			System.out.println("enter 6 number");
			s=br.readLine();
			f=Integer.parseInt(s);
			System.out.println("enter 7 number");
			s=br.readLine();
			 g=Integer.parseInt(s);
			System.out.println("enter 8 number");
			s=br.readLine();
			 h=Integer.parseInt(s);
			System.out.println("enter 9 number");
			s=br.readLine();
			 i=Integer.parseInt(s);
			System.out.println("enter 10 number");
			s=br.readLine();
			 j=Integer.parseInt(s);
		}catch(Exception m)
		{
			System.out.println("wrong input");
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		al.add(f);
		al.add(g);
		al.add(h);
		al.add(i);
		al.add(j);
		ListIterator<Integer> li=al.listIterator();
		while(li.hasPrevious())
		{
			System.out.println(li.previous()+"\t");
		}
		
	}
}
			
			
		