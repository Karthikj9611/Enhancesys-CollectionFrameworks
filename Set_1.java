import java.util.*;
public class Set_1 
{
	public static void main(String[] args)
	{
		System.out.println("HashSet");
		Set<String> a=new HashSet<String>();
		a.add("red");
		a.add("yellow");
		a.add("white");
		a.add("red");
		a.add(null);
		a.add("orange");
		a.add(null);
		System.out.println(a);		// [red, null, orange, white, yellow]
		
		System.out.println("LinkedHashSet");
		Set<String> a2=new LinkedHashSet<String>();
		a2.add("red");
		a2.add("yellow");
		a2.add("white");
		a2.add("red");
		a2.add(null);
		a2.add("orange");
		a2.add(null);
		System.out.println(a2);		// [red, yellow, white, null, orange]
		
		System.out.println("TreeSet");
		Set<String> set = new TreeSet<String>();
		set.add("Babu");
		set.add("Suresh");
		set.add("Arun");
		set.add("Zain");
		System.out.println(set);	// [Arun, Babu, Suresh, Zain]
	}
}
