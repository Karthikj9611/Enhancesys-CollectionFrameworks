import java.util.*;
public class HashMap_1 
{
	public static void main(String[] args)
	{
		Map<Integer,String> indmap = new HashMap<Integer,String>();
		indmap.put(7, "Dohni");
		indmap.put(8, "Virat");
		indmap.put(10, "Rohit");
		
		Map<Integer,String> ausmap = new HashMap<Integer, String>();
		ausmap.put(1, "Smith");
		ausmap.put(22, "Warner");
		ausmap.put(2, "Maxwell");
		
		Map<Integer,String> iplmap = new HashMap<Integer,String>();
		iplmap.putAll(indmap);
		iplmap.putAll(ausmap);
		
		System.out.println(iplmap.size());					// 6
		
		System.out.println(iplmap.isEmpty());				// false
		
		iplmap.remove(22);
		System.out.println(iplmap);							// {8=Virat, 1=Smith, 10=Rohit, 2=Maxwell, 7=Dohni}
		
		System.out.println(iplmap.containsKey(1));			// true
		
		System.out.println(iplmap.containsValue("Rohit"));  // true
		
		System.out.println(iplmap.get(8));					// Virat
		 
		System.out.println(iplmap.size());					// 5
		
		Map<Integer,String> india=new HashMap<Integer, String>();
		india.put(7,"Dohni");
		india.put(8,"Virat");
		System.out.println(india);							// {7=Dohni, 8=Virat}
		india.put(8, "Rohit");				//replace
		System.out.println(india);							// {7=Dohni, 8=Rohit}

		
		
	}
}
