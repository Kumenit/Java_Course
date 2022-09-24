import java.io.*;
class dowhile{
	public static void main(String[] args)
	{
		int i=0;
		do{
			System.out.println("\n list of ethiopian country \n");
			System.out.println("enter code crosponding to the country");
			System.out.println("1:tigray");
			System.out.println("2:amhara");
			System.out.println("3:afar");
			System.out.println("4:oromo");
			System.out.println("\n enter 0 for exiting the program");
			String s=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try
			{
				s=br.readLine();
			}catch (Exception e){}
			i=Integer.parseInt(s);
			switch(i)
			{
				case 0:System.out.println("exiting program....");
				       break;
				case 1:System.out.println("capital:"+"mekeale");
				       System.out.println("pop:7,000,000");
					   break;
				case 2:System.out.println("capital:baherdar");
				       System.out.println("pop:25,000,000");
					   break;
				case 3:System.out.println("capital:semera");
				       System.out.println("pop:3,000,000");
					   break;
				case 4:System.out.println("capital:adiss abeba");
				       System.out.println("pop:27,000,000");
					   break;
				default:System.out.println("invalid no");
			}
		}while(i!=0);
	}
}