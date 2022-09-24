package pack;
public class runtime2{
	public static void main(String[] args) throws Exception
	{
		Runtime r=Runtime.getRuntime();
		System.out.println("number of processors:"+r.availableProcessors());
		Process p=r.exec("C:/Program Files (x86)/Microsoft Office/Office14/WINWORD.exe");
		System.out.println(p.waitFor());
		System.out.println("free memory:"+r.freeMemory());
		r.gc();
		System.out.println("after freeMemory:"+r.freeMemory());
		System.out.println("maxMemory:"+r.maxMemory());
		System.out.println("totalMemory:"+r.totalMemory());
	}
}