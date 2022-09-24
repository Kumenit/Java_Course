package pack;
import java.io.*;
public class demo3{
	public static void main(String[] args)
	{ 
	String b;
	String d="no";
	do{
		String s="0";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter");
		try{
			s=br.readLine();
		}catch(Exception e){}
		 b=String.valueOf(s);
	  String a[]={"me","and","my","self"};
		sequential2 s1=new sequential2();
		s1.search(b,a);
		s1.search(b,a);
	}while(b==d);
	}
}