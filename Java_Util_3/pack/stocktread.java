package pack;
import java.util.*;
public class stocktread implements Observer{
	stock s;
	String trade;
	public stocktread(stock s,String t)
	{
		this.s=s;
		trade=t;
	}
     public void update(Observable arg0,Object arg1)
	 {
		 System.out.println("trade"+trade+"has been notified of the change in price to rs."+s.get());
	 }
}