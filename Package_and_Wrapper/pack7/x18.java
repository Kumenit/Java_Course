package pack7;
class x18{
	public static void main(String[] args)
	{
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("FALSe");
		System.out.println(b2.toString());
		System.out.println(Boolean.parseBoolean("TruE"));
		Boolean b3=new Boolean(true);
		System.out.println(b3);
		System.out.println(b2.equals(b1));
		b2=b1;
		System.out.println(b2.compareTo(b1));
		System.out.println(b1.booleanValue());
	}
}
			