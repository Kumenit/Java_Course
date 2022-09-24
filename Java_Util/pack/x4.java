package pack;
import java.io.*;
import java.util.*;
public class x4{
	public static void main(String[] args)
	{
		int a=0;
		do{
			String s=null;
			System.out.println("1.to add element");
			System.out.println("2.to remove element");
			System.out.println("3.to retrive without remove");
			System.out.println("4.is empty or not");
			System.out.println("5.view thhe contant");
			System.out.println("6.for exiting");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("enter the number croosvondint to what you want");
				s=br.readLine();
			}catch(Exception e)
			{
				System.out.println("wrong input");
			}
			 a=Integer.parseInt(s);
			ArrayList<String> al=new ArrayList<String>();
			if(a==1)
			{
				al.add("kome");
			}
			else if(a==2)
			{
				al.remove("kome");
			}
			else if(a==3)
			{
				System.out.println("element is:"+al.get(0));
			}
			else if(a==4)
			{
				System.out.println("is empty:"+al.isEmpty());
			}
			else if(a==5)
			{
				System.out.println(al);
			}
			else{
				System.out.println("wrong input");
			}
		}while(a!=6);
	}
}