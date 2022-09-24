package personpack;
import flatpack.*;
public class person{
	String name;
	int age;
	long number;
	flat f;
	public person(String n,int a,long r)
	{
		name=n;
		age=a;
		number=r;
	}
	public void display(flat f)
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("number:"+number);
		f.dipflat();
	}
}
	