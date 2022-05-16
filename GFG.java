import java.util.*;
public class GFG 
{
	static void Example1stConstructor()
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10, "Geeks");
		tm.put(15, "4");
		tm.put(20, "Geeks");
		tm.put(25, "Welcomes");
		tm.put(30, "You");
		System.out.println(tm);		// TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}
	}
	public static void main(String[] args)
	{
		Example1stConstructor();
	}
}

