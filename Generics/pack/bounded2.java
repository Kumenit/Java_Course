package pack;
public class bounded2{
	public static void main(String[] args)
	{
		System.out.println("the genral and x class");
		genral g1=new genral();
		x<genral> g=new x<genral>(g1);
		g.t.morninggreet();
		g.t.eveninggreet();
        g.t.noongreet();
		g.t.nightgreet();
		spicefy s=new spicefy();
		y<spicefy> g2=new y<spicefy>(s);
		g2.t.greet();
		g2.t.morninggreet();
		g2.t.eveninggreet();
		g2.t.noongreet();
		g2.t.nightgreet();
		
	}
}