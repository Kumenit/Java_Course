package pack;
public class class5{
	public static void main(String[] args) throws Exception
	{
		doctor d=new doctor(2,"sofe","lml");
		System.out.println("info of doctor");
		d.disp();
		Class c=d.getClass();
		System.out.println("name of class:"+c.getName());
		Package p=c.getPackage();
		System.out.println("package of this class:"+p.getName());
		Class c2=c.getSuperclass();
		System.out.println("super class of this class:"+c2.getName());
		System.out.println("doctor interface");
		Class a[]=c.getInterfaces();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i].getName()+"\t");
		doctor d1=(doctor)c.newInstance();
		System.out.println("info of second:");
		d1.disp();
		System.out.println("isInstance:"+c.isInstance(d));
		System.out.println("string :"+c.toString());
		doc d2=new doc(3,"me","you",12);
		System.out.println("info of doc");
		d2.disp();
		Class sub=d2.getClass();
		//System.out.println("isAssignableFrom:"+c.isAssignableFrom(sub));
		System.out.println("super class of te class:"+sub.getSuperclass().getName());
	}
}
	