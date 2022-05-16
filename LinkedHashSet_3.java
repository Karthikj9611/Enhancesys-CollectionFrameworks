import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class LinkedHashSet_3 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>indmap=new LinkedHashMap<Integer,String>();
		indmap.put(171, "Dohni");
		indmap.put(82, "Virat");
		indmap.put(10, "Rohit");
		System.out.println("Iterating Map using entrySet()");
		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set)
		{
			System.out.println(entry);
		}
	}
}

//		Iterating Map using entrySet()
//		171=Dohni
//		82=Virat
//		10=Rohit