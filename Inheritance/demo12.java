interface idemo{
	public void insert(int i);
	public int delete();
	public void display();
}
class stack implements idemo{
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
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(a[i]);
		}
	}
}

class queue implements idemo{
	int a[];
	int rear;
	
	public queue(int n)
	{
		a=new int[n];
		rear=-1;
	}
	
	public void insert(int i)
	{
		if(rear==a.length-1)
			System.out.println("can not insert element as queue is full");
		else{
			rear=rear+1;
			a[rear]=i;
		}
	}
	
	public int delete()
	{
		int temp;
		if(rear==-1)
		{
			System.out.println("can not delete element as queue is empty");
			temp=-999;
		}
		else{
			temp=a[0];
			for(int i=0;i<(a.length-1);i++)
				a[i]=a[i+1];
			rear--;
		}
		return temp;
	}
	
	public void display()
	{
		for(int i=0;i<=rear;i++)
			System.out.println(a[i]);
	}
}
class demo12{
	public static void main(String[] args)
	{
		System.out.println("creating a stack object of 5 elements");
		stack s=new stack(5);
		System.out.println("inserting 5 elements");
		s.insert(100);
		s.insert(200);
		s.insert(300);
		s.insert(400);
		s.insert(500);
		System.out.println("displaying the elements on the stack");
		s.display();
		System.out.println("deleteing 2 elements from stack");
		System.out.println("the two elements delete from the stack are");
		System.out.println(s.delete());
		System.out.println(s.delete());
		System.out.println("displaying the element on stack");
		s.display();
		System.out.println("inserting 2 elements");
		s.insert(1000);
		s.insert(1200);
		System.out.println("displaying the elements on the stack");
		s.display();
		System.out.println("creating a queue object of 5 elements");
		queue q=new queue(5);
		System.out.println("inserting 5 elements");
		q.insert(100);
		q.insert(200);
		q.insert(300);
		q.insert(400);
		q.insert(500);
		System.out.println("displaying the elements in the queue");
		q.display();
		System.out.println("deleteing 2 elements from queue");
		System.out.println("the two elements delete from queue are");
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println("displaying the elements in the queue");
		q.display();
		System.out.println("inserting 2 elements");
		q.insert(1000);
		q.insert(1200);
		System.out.println("displaying the elements in the queue");
		q.display();
	}
}	
		
		