package pack;
import java.util.*;
public class resourcebundle3{
	public static void main(String[] args)
	{
		ResourceBundle rb=ResourceBundle.getBundle("pack.mylist");
		System.out.println("the values crresponding to key usa:");
		String s[]=rb.getStringArray("usa");
		for(int i=0;i<4;i++)
			System.out.println(s[i]);
	}
}