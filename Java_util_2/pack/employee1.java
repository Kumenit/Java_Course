package pack;
import java.util.*;
public class employee1 implements Comparator<Double>
	{
		int empid;
		String empname;
		String empaddress;
		public employee1()
		{
		}
		public employee1(int id,String n,String a)
		{
			empid=id;
			empname=n;
			empaddress=a;
		}
		public String tostring()
		{
			return "employee id:"+empid+"employee name:"+empname+"employee address:"+empaddress;
		}
		public int compare(Double d1,Double d2)
		{
			if(d1==d2)
				return 0;
			else if(d1>d2)
				return 1;
			else return -1;
		}
	}
