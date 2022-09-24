package pack;
public class test1{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("game");
		test<StringBuffer> s1=new test<StringBuffer>(s);
		s1.s();
	}
}