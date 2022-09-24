package pack;
import java.util.*;
public class x4{
	public static void main(String[] args)
	{
		employee e1=new employee(1,"kome","is");
		employee e2=new employee(2,"sofe","is");
		employee e3=new employee(3,"desta","is");
		employee e=new employee();
		employee e4[]={e1,e2,e3};
		Arrays.sort(e4,e);
		for(int i=0;i<e4.length;i++)
		System.out.println(e4[i]+"\t");
	}
}