package pack;
public class enhancedloop2{
	public static void main(String[] args)
	{
		int sum=0;
		int a[]={10,20,30,40,50,60,70,80,90,100};
		for(int i:a)
		{
			i=i+100;
		System.out.println(i+"\t");
		}
		System.out.println();
		for(int i:a)
			System.out.println(i+"\t");
	}
}