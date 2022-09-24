package pack;
interface idemo{
	public void insert(int i);
	public int delete();
	public void display();
}
class me implements idemo{
	int a[]=new int[11];
	int top=-1;
		public void insert(int i)
		{
		top=top+1;
		a[top]=i;
	}
	int temp;
		public int delete()
	{  	
		a[top]=temp;
		top--;
	return temp;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class x16{
	public static void main(String[] args)
	{
		me m=new me();
		try{
		m.insert(100);
		m.display();
		m.delete();
		m.delete();
		try{
		m.insert(200);
		m.insert(3);
		m.insert(4);
		m.insert(2);
		m.insert(6);
		m.insert(1);
		m.insert(8);
		m.insert(9);
		m.insert(10);
		m.insert(11);
		m.display();
		m.insert(12);
		}catch(NegativeArraySizeException e)
		{
				System.out.println("array can't be negative");
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out bonds");
		}
	}
	}
		