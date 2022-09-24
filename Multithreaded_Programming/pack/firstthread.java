package pack;
import java.io.*;
public class firstthread extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			String s=null;
			System.out.println("in firstthread");
			System.out.println("enter any number");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try{
				s=br.readLine();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			int y=Integer.parseInt(s);
			y++;
			System.out.println("after incrementing the number y:"+y);
			}
		}
	}
				