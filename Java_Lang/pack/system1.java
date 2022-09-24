package pack;
public class system1{
	public static void get(String s1,String s2)
	{
		System.out.println(s1+" "+System.getProperty(s2));
	}
	public static void main(String[] args)
	{
		System.out.println("current time mili:"+System.currentTimeMillis());
		System.out.println("current time nano:"+System.nanoTime());
		int a[]={1,2,3,4,5};
		int b[]=new int[10];
	System.arraycopy(a,0,b,2,3);
	System.out.println("\narraycopy");
	for(int j=0;j<b.length;j++)
	{
		System.out.println(b[j]+"\t");
	}
	System.out.println("\n\ngetting property");
	get("java version:","java.version");
	get("java vendor:","java.vendor");
	get("java vendor url:","java.vendor.url");
	get("java installation directory:","java.home");
	get("os name:","os.name");
	get("os architecture:","os.arch");
	get("user account name:","user.name");
	get("user home directory:","user.home");
	get("user current working dir:","user.dir");
	}
}