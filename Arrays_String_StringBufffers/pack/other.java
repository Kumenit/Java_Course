package pack;
public class other{
		public static void display(String s[])
		{
			for(int i=0;i<s.length;i++)
				System.out.println(s[i]+"\t");
			System.out.println();
		}
		public static void main(String[] args)
		{
			String s1="likelikelike";
			String s[]=s1.split("ik");
			System.out.println("split:");
			display(s);
			System.out.println("split whit int:");
			s=s1.split("ik",10);
			display(s);
			s=s1.split("k",0);
			System.out.println("split whit 0:");
			int k=s.length;
			System.out.println("k:"+k);
			display(s);
			System.out.println("split whit -i:");
			s=s1.split("k",-3);
			System.out.println("k1:"+s.length);
			display(s);
			System.out.println("toLowerCase:"+"aBliTdFGR".toLowerCase());
			System.out.println("toUpperCase:"+"akLeftEA:".toUpperCase());
			String s2="like";
			System.out.println("getClass:"+s2.getClass());
			System.out.println("hashCode:"+s2.hashCode());
			System.out.println("length:"+s2.length());
		}
}