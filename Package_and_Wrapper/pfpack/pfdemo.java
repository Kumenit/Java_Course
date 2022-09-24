package pfpack;
import personpack.*;
import flatpack.flat;
public class pfdemo{
	public static void main(String[] args)
	{
	person p=new person("kome",18,938643558);
	flat f=new flat("best",7,678);
	p.display(f);
	}
}