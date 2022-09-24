package pack;
public class enumclass{
	public static void main(String[] args)
	{
		ccharacter cc;
		cc=ccharacter.archie;
		System.out.println("name:"+cc.name());
		System.out.println("position:"+cc.ordinal());
		System.out.println("cc.equals"+cc.equals(ccharacter.richie));
		System.out.println("cc.compare:"+cc.compareTo(ccharacter.richie));
		System.out.println("getDiclaringClass:"+cc.getDeclaringClass().getName());
		System.out.println("enum constant:"+ccharacter.valueOf(ccharacter.class,"archie"));
	}
}