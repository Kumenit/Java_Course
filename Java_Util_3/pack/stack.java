package pack;
import java.util.*;
public class stack{
	public static void main(String[] args)
	{
		Stack<String> s=new Stack<String>();
		s.addElement("kumenit");
		s.addElement("sofonias");
		s.addElement("desta");
		System.out.println("contents of he stack:"+s);
		System.out.println("using push:"+s.push("me"));
		System.out.println("using peek:"+s.peek());
		System.out.println("using pop:"+s.pop());
		System.out.println("using serach:"+s.search("desta"));
		System.out.println("is empty:"+s.empty());
	}
}