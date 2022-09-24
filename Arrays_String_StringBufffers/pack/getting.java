package pack;
public class getting{
	public static void main(String[] args)
	{
		String s1="kumenit";
		System.out.println("concat:"+s1.concat("desta"));
		System.out.println("replace:"+s1.replace('u','o'));
		CharSequence cr="i";
		CharSequence c1="g";
		System.out.println("replace:"+s1.replace(cr,c1));
		System.out.println("repalace:"+s1.replace("um","lv"));
		String s2="besttest";
		System.out.println("replaceFirst:"+s2.replaceFirst("es","le"));
		System.out.println("subSequence:"+s2.subSequence(2,5));
		System.out.println("subString:"+s2.substring(3));
		System.out.println("subString:"+s2.substring(3,6));
		char c[]=s2.toCharArray();
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]+"\t");
	    System.out.println();
		
		System.out.println("toString:"+s1.toString());
		System.out.println("before trming:"+s1+"this is");
		String i=s1.trim();
		System.out.println("trime:"+i+"after");
	}
}
		
		