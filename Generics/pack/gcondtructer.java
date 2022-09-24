package pack;
public class gcondtructer{
	public static void main(String[] args)
	{
       doc d=new doc(1,"you","me");
	   pdoc p=new pdoc(2,"and","i",11,12,13);
	   gdoc g=new gdoc(3,"kome","cmc",11,111,1111,1);
	   info i=new info(d);
	   i.display();
	   info i1=new info(p);
	   i1.display();
	   info i2=new info(g);
	   i2.display();
	}
}