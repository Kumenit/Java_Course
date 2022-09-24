package pack;
import java.util.*;
public class linkedhashmap{
    public static void main(String args[])
	 {
		LinkedHashMap<String,String> lh=new LinkedHashMap<String,String>(16,0.75f,true);
		lh.put("ku","kumenit");
		lh.put("so","sofoniase");
		lh.put("d","desta");
		lh.put("gen","genet");
		System.out.println("lh containts:"+lh);
		System.out.println("get gen:"+lh.get("gen"));
		System.out.println("get ku:"+lh.get("ku"));
		System.out.println("after get method:"+lh);
		System.out.println("/n");
		LinkedHashMap<String,String> lh1=new LinkedHashMap<String,String>(16,0.75f,false);
		lh1.put("ku","kumenit");
		lh1.put("so","sofoniase");
		lh1.put("d","desta");
		lh1.put("gen","genet");
		System.out.println("intial vlaue of lh1:"+lh1);
		System.out.println("get gen:"+lh.get("gen"));
		System.out.println("get ku:"+lh.get("ku"));
		System.out.println("after that lh1:"+lh1);
	 }
}
		

	