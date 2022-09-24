class doctor{
	String set="like";
}
class game extends doctor{
	String set="love";
	public void display()
	{
		System.out.println("super ser:"+super.set);
		System.out.println("set:"+set);
	}
}
class demo5{
	public static void main(String[] args)
	{
		game g1=new game();
		System.out.println("details");
		g1.display();
	}
}
	