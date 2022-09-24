class quadrilateral{
	double s1,s2,s3,s4;
	
	public quadrilateral(double side1,double side2,double side3,double side4)
	{
		s1=side1;
		s2=side2;
		s3=side3;
		s4=side4;
	}
	public double computearea()
	{
		System.out.println("this method is for specific quadrilateral");
		return -999;
	}
}
class square extends quadrilateral {
	public square(double side1) {
		super(side1,side2,side3,side4);
	}
	
	public double computearea()
	{
		return (s1 * s1);
	}
}
class rectangle extends quadrilateral {
	public rectangle(double side1,double side2) {
		super(side1,side2,side3,side4);
	}
	
	public double computearea()
	{
		return(s1*s2);
	}
}
class demo10a{
	public static void main(String[] args)
	{
		quadrilateral rafvar;
		
		quadrilateral q=new quadrilateral(1,2,3,4);
		square s=new square(10);
		rectangle r=new rectangle(10,20);
		
		rafvar=q;
		System.out.println("area:"+rafvar.computearea());
		
		rafvar=s;
	    System.out.println("area of square:"+rafvar.computearea());
		
		rafvar=r;
		System.out.println("area of rectangle:"+rafvar.computearea());
	}
}
		
	