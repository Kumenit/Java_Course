package pack;
import java.util.*;
public class stock extends Observable{
	private int price;
	public void set(int p)
	{
		price=p;
		setChanged();
		notifyObservers();
		clearChanged();
	}
	public int get()
	{
		return price;
	}
}