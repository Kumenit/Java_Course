class game{
	int docid;
	String docname;
	String docaddress;
	game()
	{
		docid=3;
		docname="game";
		docaddress="cmc";
	}
	game(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	game(game g)
	{
		docid=g.docid;
		docname=g.docname;
		docaddress=g.docaddress;
	}
	void display()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
	int docid(){
		return docid;
	}
	String docname()
	{
		return docname;
	}
	String docaddress(){
		return docaddress;
	}
}
class doctor13{
	public static void main(String[] args)
	{
		int i;
		String n;
		String a;
		 System.out.println("details of doctor\n");
		game g1=new game();
		i=g1.docid();
		n=g1.docname();
		a=g1.docaddress();
       
		g1.display();
		System.out.println();
		
		game g2=new game(2,"kome","house");
		
		i=g2.docid();
		n=g2.docname();
		a=g2.docaddress();
		g2.display();
		System.out.println();
		game g3=new game(g2);
		i=g3.docid();
		n=g3.docname();
		a=g3.docaddress();
		g3.display();
	}
}