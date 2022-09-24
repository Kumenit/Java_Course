package pack;
public class enumdemo{
	public static void main(String[] args)
	{
		ccharacter cc;
		cc=ccharacter.archie;
		System.out.println("first:"+cc);
	if(cc==ccharacter.archie)
	{
		System.out.println("cc point to archie");
		cc=ccharacter.jerry;
	}
		switch(cc)
		{
			case archie:System.out.println("archie is a teenager");
			break;
			case sabrina:System.out.println("sabrina is a teenage witch");
			break;
			case tom:System.out.println("tom is cat");
			break;
			case jerry:System.out.println("jerry is mouse");
			break;
			case mickey:System.out.println("mickey is a mouse");
			break;
			case richie:System.out.println("richie is a rich boy");
			break;
		}
		ccharacter c[]=ccharacter.values();
		System.out.println("enum character");
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		System.out.println("enum constant:"+ccharacter.valueOf("mickey"));
	}
}
	
	
	