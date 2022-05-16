import java.util.*;
public class ListIterator 
{
	public static void main(String[] args)
	{
		List<String> lst = new ArrayList<String>();
		lst.add("Babu");
		lst.add("Suresh");
		lst.add("Arun");
		lst.add("Zain");
		System.out.println(lst);				// [Babu, Suresh, Arun, Zain]
		System.out.println();
		java.util.ListIterator<String> itr=lst.listIterator();	
		while(itr.hasNext())
		{
			String name=itr.next();				// Babu	Suresh Arun	Zain
			System.out.println(name);
		}
		System.out.println();
		List<String> lst1 = new ArrayList<String>();
		lst1.add("Babu");
		lst1.add("Suresh");
		lst1.add("Arun");
		lst1.add("Zain");
		System.out.println(lst1);				// [Babu, Suresh, Arun, Zain]
		System.out.println();
		java.util.ListIterator<String> itr1=lst1.listIterator(lst1.size());
		while(itr.hasPrevious()) 
		{
			String name=itr.previous();		
			System.out.println(name);			// Zain	Arun Suresh	Babu
		}
	}
}
