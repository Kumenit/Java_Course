package pack;
public class stringbuffer3{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("me and my self");
			System.out.println("delete:"+s.delete(3,7));
				System.out.println("deleteCharAt:"+s.deleteCharAt(4));
		StringBuffer s1=new StringBuffer("me");
		StringBuffer s2=new StringBuffer("me");
				System.out.println("equals:"+s1.equals(s2));
				s1=s2;
					System.out.println("equals:"+s1.equals(s2));
					StringBuffer s3=new StringBuffer("best");
				System.out.println("insert 2:"+s3.insert(3,1));
				System.out.println("insert true:"+s3.insert(2,true));
				System.out.println("insert i:"+s3.insert(3,'i'));
				char c[]={' ','a','n','d'};
				System.out.println("insert c[]:"+s3.insert(5,c));
				System.out.println("IndexOf:"+s3.indexOf("true"));
				System.out.println("lastIndexOf:"+s3.lastIndexOf("i",3));
				System.out.println("new length:"+s3.length());
				System.out.println("replace:"+s3.replace(1,12,"game"));
				System.out.println("new length:"+s3.length());
				System.out.println("reverse:"+s3.reverse());
				
						
	}
}