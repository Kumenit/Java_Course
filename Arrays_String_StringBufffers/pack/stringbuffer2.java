package pack;
public class stringbuffer2{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("me and my self");
			System.out.println("length:"+s.length());
				System.out.println("capacity:"+s.capacity());
				s.ensureCapacity(65);
				System.out.println("new capacity:"+s.capacity());
				
					System.out.println("after:"+s);
					s.setLength(13);
						System.out.println("new length:"+s.length());
	}
}