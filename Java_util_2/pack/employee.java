package pack;
import java.util.*;
public class employee implements Comparator<employee>
	{
		int empid;
		String empname;
		String empaddress;
		public employee()
		{
		}
		public employee(int id,String n,String a)
		{
			empid=id;
			empname=n;
			empaddress=a;
		}
		public String tostring()
		{
			return "employee id:"+empid+"employee name:"+empname+"employee address:"+empaddress;
		}
		public int compare(employee e1,employee e2)
		{
			if(e1.empid==e2.empid)
				return 0;
			else if(e1.empid>e2.empid)
				return 1;
			else return -1;
		}
	}
