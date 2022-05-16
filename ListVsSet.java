import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class ListVsSet 
{
	public static void main(String[] args) 
	{
		List<String> lst = new LinkedList<String>();
		lst.add("red");
		lst.add("yellow");
		lst.add("white");
		lst.add("red");
		lst.add(null);
		lst.add("orange");
		lst.add(null);
		System.out.println("List "+lst);			// List [red, yellow, white, red, null, orange, null]
		
		Set<String> set = new HashSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("white");
		set.add("red");
		set.add(null);
		set.add("orange");
		set.add(null);
		System.out.println("Set "+set);			// Set [red, null, orange, white, yellow]
	}
}
