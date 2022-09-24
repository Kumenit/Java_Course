package pack;
import java.util.*;
public class enumset{
	public static void main(String[] args)
	{
		EnumSet<chartooncharacter> e=EnumSet.allOf(chartooncharacter.class);
		System.out.println("elements of e");
		Iterator<String> i=e.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		EnumSet<chartooncharacter> e2=EnumSet.range(chartooncharacter.archie,chartooncharacter.tom);
		System.out.println("\n enumset e2:"+e2);
		EnumSet<chartooncharacter> e3=EnumSet.complementOf(e2);
		System.out.println("\n enumset e3:"+e3);
		EnumSet<chartooncharacter> e4=EnumSet.noneOf(chartooncharacter.class);
		System.out.println("\n enumset e4:"+e4);
		e4.add(chartooncharacter.archie);
		System.out.println("after adding constant:"+e4);
		EnumSet<chartooncharacter> e5=EnumSet.copyOf(e);
		System.out.println("enumset e5:"+e5);
		EnumSet<chartooncharacter> e6=EnumSet.of(chartooncharacter.richie);
		System.out.println("enumset e6:"+e6);
	}
}
		