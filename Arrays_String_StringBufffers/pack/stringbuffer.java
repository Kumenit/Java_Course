package pack;
public class stringbuffer{
	public static void main(String[] args)
	{
		StringBuffer st=new StringBuffer("me");
		System.out.println("append 15:"+st.append(15));
		System.out.println("append 'i':"+st.append('i'));
		st.append("and my self");
		System.out.println("append string:"+st);
		char c[]={'i','a','m','b','e','s','t'};
	st.append(c,2,4);
	System.out.println("append c:"+st);
	st.appendCodePoint(45);
	System.out.println("appendCodePoint:"+st);
	
		StringBuffer s1=new StringBuffer("like");
		s1.charAt(2);
		System.out.println("charAt:"+s1);
		s1.setCharAt(2,'t');
		System.out.println("setCharAt:"+s1);
		System.out.println("codePointAt(2):"+s1.codePointAt(2));
		char ch[]=new char[2];
		s1.getChars(1,3,ch,0);
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]+"\t");
		System.out.println();
	}
}