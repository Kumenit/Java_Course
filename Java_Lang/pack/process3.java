package pack;
import java.io.*;
public class process3{
	public static void main(String[] args) throws Exception
	{
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("C:/k-disk/game's/runasdate/RunAsDate.exe");
		InputStream is=p.getInputStream();
		System.out.println("input stream:"+is.getClass().getName());
		OutputStream os=p.getOutputStream();
		System.out.println("output stream:"+os.getClass().getName());
		is=p.getErrorStream();
		System.out.println("error stream:"+os.getClass().getName());
		Thread.sleep(5000);
		//p.waitFor();
		p.destroy();
		Thread.sleep(2000);
		System.out.println("exit:"+p.exitValue());
	}
}