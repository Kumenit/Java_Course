package pack7;
public class nan{
	public static void main(String[] args)
	{
		Float f1=new Float(0.0f/0.0f);
		Float f2=new Float(45f/0.0f);
		Float f3=new Float(-36f/0.0f);
		Float f4=new Float(-43f/(1f/0.0f));
		Float f5=new Float(100.0f);
		System.out.println("f1="+f1.floatValue());
		System.out.println("a="+(f1+100f));
		System.out.println("b="+(f1-100f));
		System.out.println("c="+(f1*120f));
		System.out.println("d="+(f1/450f));
		System.out.println("f2="+f2.floatValue());
		System.out.println("a="+(f2*4f/2f));
		System.out.println("b="+(f2-123f+43f));
		System.out.println("f3="+f3.floatValue());
		System.out.println("a="+(f3+400f));
		System.out.println("b="+(f3/23f));
		System.out.println("f4="+f4.floatValue());
		System.out.println("a="+(f4+100f));
		System.out.println("b="+(f4-100f));
		System.out.println("f5:"+(f5.floatValue()));
		System.out.println("a="+(f5/0.0f));
		System.out.println("b="+(f5/-0.0f));
	}
}
		