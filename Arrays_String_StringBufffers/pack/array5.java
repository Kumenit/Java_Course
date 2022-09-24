package pack;
public class array5{
public static void main(String[] args)
{
	double varlength[][]=new double[4][];
	varlength[0]=new double[4];
	varlength[1]=new double[3];
	varlength[2]=new double[2];
	varlength[3]=new double[1];

        int temp1=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<temp1;j++)
				varlength[i][j]=j*10;
			
				temp1--;
		}
		System.out.println("the number");
		int temp2=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<temp2;j++)
				System.out.println(varlength[i][j]+"\t");
			System.out.println();
			temp2--;
		}
}
}