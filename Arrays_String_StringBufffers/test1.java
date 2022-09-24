import java.io.*;
class test1{
	public static void main(String[] args)
	{
		int a=0;
		int b=0,c=0,d=0;
		do{
      String s=null;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter any number");
	  System.out.println("enter 0 to exit");
	  try{
		  System.out.println("enter 1 number");
		  s=br.readLine();
		  a=Integer.parseInt(s);
		    System.out.println("enter 2 number");
			s=br.readLine();
			b=Integer.parseInt(s);
			  System.out.println("enter 3 number");
			  s=br.readLine();
	      c=Integer.parseInt(s);
			    System.out.println("enter 4 number");
				s=br.readLine();
			d=Integer.parseInt(s);
	  }catch(Exception e){}
	  int e[]={a,b,c,d};
	   int sum=0;
	  for(int i:e)
	  {
		  sum=sum+i;
		  System.out.println("sum:"+sum);
	  }
		}while(a>0);
	  
	}
}