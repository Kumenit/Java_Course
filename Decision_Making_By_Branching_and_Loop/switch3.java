import java.io.*;
class switch3{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("choose family mamber");
		System.out.println("1:kumenit");
		System.out.println("2:sofonias");
		System.out.println("3:desta");
		System.out.println("4:genet");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int family=Integer.parseInt(s);
		System.out.println("enter what you need to know about");
		System.out.println("1:favirit sport");
		System.out.println("2:favirit music");
		System.out.println("3:about their work");
		System.out.println("4:faviroit thing to do");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int about=Integer.parseInt(s);
		switch(family)
		{
			case 1:switch(about)
			{
				case 1:System.out.println("kumenit favioryt sport is basketball");
				      break;
				case 2:System.out.println("kumenit favioryt  music is alen walker");
				      break
				case 3:System.out.println("kumenit work is a student in minlik school");
				       break
				case 4:System.out.println("kumenit favioryt thing to do is learn about computer");
				      break;
				default:System.out.println("invalid number");
			}
			break;
			case 2:switch(about)
			{
				case 1:System.out.println("sofinies favioryt spor is tenes");
				break;
				case 2:System.out.println("sofinies faviroit music is pop");
				break;
				case 3:System.out.println("sofinies faviroit work noting");
				break;
				case 4:System.out.println("sofinies faviroit eating chips");
				break;
			default :System.out.println("invalid number");
			}
			break;
			case 3:switch(about)
			{
				case 1:System.out.println("desta favioryt sport is football");
				      break;
				case 2:System.out.println("desta favioryt  music is tigray");
				      break
				case 3:System.out.println("desta work is a student in misrake dile");
				       break
				case 4:System.out.println("desta favioryt thing to do is working in kitichen");
				      break;
				default:System.out.println("invalid number");
			}
			break;
			case 4:switch(about)
			{
				case 1:System.out.println("genet favioryt sport is unknown");
				      break;
				case 2:System.out.println("genet favioryt  music is unknown");
				      break
				case 3:System.out.println("genet work is a student in unknown");
				       break
				case 4:System.out.println("genet favioryt thing to do unknown");
				      break;
				default:System.out.println("invalid number");
			}
			default: System.out.println("invalid number");
		}
	}
}	
       
			
			
			
		
	
