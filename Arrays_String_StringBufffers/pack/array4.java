package pack;
public class array4{
	public static void main(String[] args)
	{
		int a[][]={{10,20,30},{40,50,60},{70,80,90}};
	int b[][]={{56,76,45},{50,40,67},{1,2,3}};
	int c[][]=new int[3][3];
	for(int i=0;i<3;i++)
	for(int j=0;j<3;j++)
	
		c[i][j]=a[i][j]+b[i][j];
	System.out.println("the number");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println(c[i][j]+"\t");
		}
		System.out.println();
	}
	}
}
			