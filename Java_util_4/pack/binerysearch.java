package pack;
import java.util.*;
import java.io.*;
public class binerysearch{
	public static void main(String[] args)
	{
		int a[]={2,3,4,5,1,6,7,8,9};
		int k=0;
		String s=null;
		Arrays.sort(a);
		System.out.println("enter any number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		int i=Integer.parseInt(s);
		int l=Arrays.binarySearch(a,i);
		if(l<0)
		{
			System.out.println("key"+k+"is not present");
			System.out.println("retuned value:"+l);
		}
		else{
			System.out.println("key"+k+"is prsent at index"+l);
		}
	}
}