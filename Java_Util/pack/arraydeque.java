package pack;
import java.util.*;
public class arraydeque{
   public static void main(String[] args)
       {
		   ArrayDeque<String> ad=new ArrayDeque<String>();
		   ad.add("india");
		ad.add("usa");
		ad.add("ethio");
		ad.add("england");
		ad.add("sweden");
		ad.add("Russia");
	System.out.println("content of ad");
	System.out.println(ad);
	System.out.println("first element:"+ad.getFirst());
	System.out.println("last element:"+ad.getLast());
	System.out.println("peek:"+ad.peek());
	ad.removeFirst();
	ad.removeLast();
	ad.pop();
	System.out.println("after using removeFirst,removeLast and pop");
	System.out.println(ad);
	   }
}