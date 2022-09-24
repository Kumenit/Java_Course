package pack;
public enum person implements einterface{
	tom(25,"margo"),dick(30,"panaji"),harry(28,"ponda");
	private int age;
	private String city;
	person(int age,String city)
	{
		this.age=age;
		this.city=city;
	}
	public void disp()
	{
		System.out.println("age:"+age);
		System.out.println("city:"+city);
	}
}
	

