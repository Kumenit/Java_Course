interface idemo{
	public void insert(int i);
	public int delete();
	public void display();
}
abstract class stack implements idemo{
	int a[];
	int top;
	
	public stack(int n)
	{
		a=new int[n];
		top=-1;
	}
	
	public void insert(int  i)
	{
		if(top==a.length-1)
			System.out.println("can not insert element as stack is full");
		else
		{
			top=top+1;
			a[top]=i;
		}
	}
	
	public int delete()
	{
		int temp;
		if(top==-1)
		{
			System.out.println("can not delete element as stack is empty");
			temp=-999;
		}
	else
	{
		temp=a[top];
		top--;
	}
	return temp;
	}
	
}
class stack1 extends stack{
	public stack1(int n)
	{
		super(n);
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
			System.out.println(a[i]);
	}
}
	
class demo14{
	public static void main(String[] args)
	{
		stack1 s=new stack1(4);
		System.out.println("the inserted number are:");
		s.insert(120);
		s.insert(130);
	System.out.println("displaying");
	s.display();
	System.out.println("deleteing");
	System.out.println(s.delete());
	System.out.println("displaying");
	s.display();
	System.out.println("inserting");
	s.insert(243);
	s.insert(142);
	System.out.println("displaying");
	s.display();
	}
}
		
		
		