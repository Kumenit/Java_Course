package pack3;
import pack1.company;
import pack2.*;
class importdemo
{
	public static void main(String[] args)
	{
		company c=new company("java industrial","game");
		doctor d=new doctor(1,"sofe","bole");
		c.display(d);
	}
}