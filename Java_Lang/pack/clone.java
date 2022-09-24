package pack;
public class clone{
	public static void main(String[] args)
	{
		doctor1 d=new doctor1(1,"kome","cmc");
		System.out.println("doc 1");
		d.disp();
		doctor1 d1=(doctor1)d.clone();
		System.out.println("doc 2");
		d1.disp();
		doctor1 d3=d.myclone();
		System.out.println("doc 3");
		d3.disp();
	}
}