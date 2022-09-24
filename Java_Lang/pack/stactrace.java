package pack;
public class stactrace{
	public static void disp(int i)
	{
		if(i==0)
		{
			double d=0.0/0.0;
			System.out.println("d="+d);
		}
		else
			throw new NumberFormatException();
	}
	public static void main(String[] args)
	{
		try{
			disp(100);
		}catch(Throwable t)
		{
			StackTraceElement s[]=t.getStackTrace();
			for(int i=0;i<s.length;i++)
			{
				System.out.println("class name:"+s[i].getClassName());
				System.out.println("file name:"+s[i].getFileName());
				System.out.println("method name:"+s[i].getMethodName());
				System.out.println("line number:"+s[i].getLineNumber());
				System.out.println("is native:"+s[i].isNativeMethod());
			}
		}
	}
}