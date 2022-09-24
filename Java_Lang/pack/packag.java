package pack;
public class packag{
	public static void main(String[] args)
	{
		Package p=Package.getPackage("java.io");
		System.out.println("Implementation title:"+p.getImplementationTitle());
		System.out.println("implementation version:"+p.getImplementationVersion());
		System.out.println("implementation vendor:"+p.getImplementationVendor());
		System.out.println("name:"+p.getName());
		System.out.println("specification title:"+p.getSpecificationTitle());
		System.out.println("specification version:"+p.getSpecificationVersion());
		System.out.println("specification vendor:"+p.getSpecificationVendor());
	}
}