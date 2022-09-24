package figpack;
class ademo1{
	public static void main(String[] args)
	{
		System.out.println("area & volume");
		cone c=new cone(10,20,15);
		c.calcarea();
		c.calcvolume();
		System.out.println("area & volume of cone");
		c.disparea();
		c.dispvolume();
		sphere s=new sphere(10);
		s.calcarea();
		s.calcvolume();
		System.out.println("area & volume of sphere");
		s.disparea();
		s.dispvolume();
		cylinder d=new cylinder(10,20);
		d.calcarea();
		d.calcvolume();
		System.out.println("area & volume of cylinder");
		d.disparea();
		d.dispvolume();
	}
}