package pack;
import java.util.*;
public class x6a{
	public static void main(String[] args)
	{
		doc1 d1=new doc1(1,"kome","game");
		doc1 d2=new doc1(2,"sofe","film");
		doc1 d3=new doc1(3,"genet","her");
		doc1 d4=new doc1(4,"desta","him");
		doc1 d[]={d1,d2,d3,d4};
		Arrays.fill(d,d3);
		int i=0;
		while(i<4)
		{
			d[i].disp();
			i++;
		}
	}
}