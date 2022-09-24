package pack;
public class ginterface{
	public static void main(String[] args)
	{
		quadrilateral q=new quadrilateral();
		square s=new square(10);
		rectangle r=new rectangle(10,20);
		
		figure<quadrilateral> f1=new figure<quadrilateral>(q);
		System.out.println("quadrilateral");
		System.out.println(f1.display());
		figure<square> f2=new figure<square>(s);
		System.out.println("square");
		System.out.println(f2.display());
		figure<rectangle> f3=new figure<rectangle>(r);
		System.out.println("rectangle");
		System.out.println(f3.display());
	}
}
		
		