package pack;
import java.util.*;
public class mylist extends ListResourceBundle{
	protected Object[][] getContents()
	{
		String s1[]={"new delhi","mumbai","kolkata","chennai"};
	String s2[]={"new york","washington","los angeles","san fransisco"};
	String s3[]={"canberra","sydney","perth","melbourne"};
	Object o[][]={{"india",s1},{"usa",s2},{"australia",s3}};
	return o;
	}
}