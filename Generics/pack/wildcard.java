package pack;
public class wildcard{
	public static void main(String[] args)
	{
		Integer ia[]={10,20,30,40,50};
		sum<Integer> s=new sum<Integer>(ia);
		System.out.println("sum of sq is:"+s.sq());
		Double da[]={10.0,20.0,30.0,40.0,50.0};
		sum<Double> d=new sum<Double>(da);
		System.out.println("sum of da is:"+d.sq());
		if(s.isequal(d))
			System.out.println("the sum are equal");
		else
			System.out.println("the sum are not equal");
	}
}