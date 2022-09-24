package pack;
public class cricketer{
	String name;
	int rs;
	int wt;
	int cc;
	public cricketer(String n,int r,int w,int c)
	{
		name=n;
		rs=r;
		wt=w;
		cc=c;
	}
	public String tostring()
	{
		return "name:"+name+"runs scored:"+rs+"wickets taken:"+wt+"cacth caught:"+cc;
	}
}