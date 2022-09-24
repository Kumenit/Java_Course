import java.io.*;
class test{
	public static void main(String[] args)
	{
		int i;
		do{
      String s=null;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter");
	  try{
		  s=br.readLine();
	  }catch(Exception e){}
	  i=Integer.parseInt(s);
	  int k=i*i;
	  System.out.println("square of"+i+"is:"+k);
		}while(i>=0);
	  
	}
}