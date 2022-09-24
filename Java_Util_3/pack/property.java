package pack;
import java.util.*;
public class property{
	public static void main(String[] args)
	{
		Properties p=new Properties();
		p.setProperty("ku","kumenit");
		p.setProperty("so","sofonias");
		p.setProperty("d","desta");
		System.out.println("getProperty of ku:"+p.getProperty("ku"));
		System.out.println("getProperty me:"+p.getProperty("me"));
		System.out.println("getProperty me:"+p.getProperty("me","noting"));
	}
}