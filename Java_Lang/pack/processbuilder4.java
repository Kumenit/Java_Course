package pack;
import java.util.*;
import java.io.*;
public class processbuilder4{
	public static void main(String[] args)
	{
		ProcessBuilder pb=new ProcessBuilder("C:/Program Files (x86)/Microsoft Office/Office14/WINWORD.exe");
		try{
			pb.start();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		List<String>list=pb.command();
		System.out.println("command:"+list.get(0));
		File fir=pb.directory();
		if(fir!=null)
		System.out.println("working directory:"+fir.getName());
	else
		System.out.println("the working directory of current");
	boolean b=pb.redirectErrorStream();
	System.out.println("redirectErrorStream:"+b);
	}
}