package pack;
import java.util.*;
public class priorityqueue{
	public static void main(String[] args)
	{
		PriorityQueue<String> l1=new PriorityQueue<String>();
		l1.add("india");
		l1.add("usa");
		l1.add("ethio");
		l1.add("england");
		l1.add("sweden");
		l1.add("Russia");
		System.out.println("the content of pq:"+l1);
		l1.remove();
		System.out.println("after using romve peek:"+l1.peek());
		l1.poll();
		System.out.println("after using poll:"+l1.element());
	}
}