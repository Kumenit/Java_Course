package pack;
import java.util.*;
public class collection3{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("kome");
		al.add("sofe");
		al.add("desta");
		al.add("desta");
		System.out.println("the intial final of al:"+al);
		Collections.shuffle(al);
		System.out.println("after using suffle:"+al);
		Random r=new Random(10000230);
		Collections.shuffle(al,r);
		System.out.println("after suffle have been used with random:"+al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("me");
		al2.add("you");
		al2.add("us");
		al2.add("best");
		Collections.copy(al,al2);
		System.out.println("after using copy :"+al);
	}
}