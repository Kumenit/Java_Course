package pack;
public class boundedwild{
	public static void dispe(x1<?> ei)
	{
		System.out.println("the dispe block");
		for(int i=0;i<ei.e.length;i++)
		System.out.println("id:"+ei.e[i].docid+"name:"+ei.e[i].docname+"address:"+ei.e[i].docaddress);
	}
	public static void dispp(x1<? extends doctor> ei)
	{
		System.out.println("the dispp block");
		for(int i=0;i<ei.e.length;i++)
			System.out.println("id:"+ei.e[i].docid+"name:"+ei.e[i].docname+"address:"+ei.e[i].docaddress+"basic:"+ei.e[i].basic+"da:"+ei.e[i].da+"hra:"+ei.e[i].hra);
	}
	public static void dispg(x1<? extends pdoctor> ei)
	{
		System.out.println("the disp g block");
		for(int i=0;i<ei.e.length;i++)
			System.out.println("id:"+ei.e[i].docid+"name:"+ei.e[i].docname+"address:"+ei.e[i].docaddress+"basic:"+ei.e[i].basic+"da:"+ei.e[i].da+"hra:"+ei.e[i].hra+"ga:"+ei.e[i].ga);
	}
	public static void main(String[] args)
	{
		doctor d=new doctor(1,"i","they");
		doctor d1=new doctor(2,"me","you");
		doctor d2=new doctor(3,"like","game");
	doctor e1[]={d,d1,d2};
	x1<doctor> x=new x1<doctor>(e1);
	dispe(x);
	System.out.println("\n\n");
	pdoctor d3=new pdoctor(4,"life","good",12,43,56);
	pdoctor d4=new pdoctor(5,"is","not",45,34,21);
	pdoctor d5=new pdoctor(6,"that","is",67,83,24);
	pdoctor e2[]={d3,d4,d5};
	x1<pdoctor> x1=new x1<pdoctor>(e2);
	dispe(x1);
	dispp(x1);
	Syste.out.println("\n\n");
	gdoctor d6=new gdoctor(7,"very","good",65,78,90,12);
	gdoctor d7=new gdoctor(8,"and","great",94,37,56,45);
	gdoctor d8=new gdoctor(9,"that","my",87,94,56,67,375);
	gdoctor e3[]={d6,d7,d8};
	x1<gdoctor> x2=new x1<gdoctor>(e3);
	dispe(x2);
	dispp(x2);
	dispg(x2);
	}
}