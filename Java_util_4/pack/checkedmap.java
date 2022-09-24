package pack;
import java.util.*;
public class checkedmap{
	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		Map m=Collections.checkedMap(hm,Integer.class,String.class);
		hm.put(new Integer(10),"me");
		hm.put(new Integer(20),"you");
		System.out.println("the contant of hm:");
		System.out.println(hm.entrySet());
		try{
			hm.put(new Integer(3),"thta");
			hm.put(new Double(12.34),"Tim");
		}catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("the contant of hm");
		System.out.println(hm.entrySet());
	}
}