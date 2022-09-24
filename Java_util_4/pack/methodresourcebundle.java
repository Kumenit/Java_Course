package pack;
import java.util.*;
public class methodresourcebundle{
	public static void main(String[] args)
	{
		ResourceBundle rb=ResourceBundle.getBundle("pack.get");
		System.out.println("getObject of k1:"+rb.getObject("k1"));
		System.out.println("containsKey k5:"+rb.containsKey("k5"));
		Set<String> s=rb.keySet();
		System.out.println("the keySet is:"+s);
	}
}