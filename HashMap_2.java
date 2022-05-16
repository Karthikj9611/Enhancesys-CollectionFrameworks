import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap_2 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> indmap=new HashMap<Integer,String>();
		indmap.put(7,"Dohni");
		indmap.put(8,"Virat");
		indmap.put(10,"Rohit");
		
		System.out.println("Iterating Map using entrySet()");
		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set)
		{
			Integer key=entry.getKey();
			String val=entry.getValue();
			System.out.println(key+" = "+" "+val);
		}
		
		System.out.println("Iterating Map using keySet()");
		Set<Integer> s=indmap.keySet();
		for(Integer i:s)
		{
			System.out.println("Key ="+" "+i);
		}
		
		System.out.println("Iterating Map using values()");
		Collection<String> c=indmap.values();
		for(String s1:c) 
		{
			System.out.println("value ="+" "+s1);
		}
	}
}

//			Iterating Map using entrySet()
//			7 =  Dohni
//			8 =  Virat
//			10 =  Rohit
//			Iterating Map using keySet()
//			Key = 7
//			Key = 8
//			Key = 10
//			Iterating Map using values()
//			value = Dohni
//			value = Virat
//			value = Rohit
