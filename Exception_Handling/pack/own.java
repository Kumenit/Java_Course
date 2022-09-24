package pack;
public class own extends Exception{
	public own(int i)
	{
		if(i==0)
			System.out.println("you have interd zero");
		else
			System.out.println("you interd negative number");
		System.out.println("throwing exception");
	}
}
