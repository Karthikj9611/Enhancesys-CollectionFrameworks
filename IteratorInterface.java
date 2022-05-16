import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorInterface 
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
		
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			System.out.println(name);			// Babu Suresh Arun Zain
			if(name=="Suresh")
				itr.remove();
		}
		System.out.println(lst);				// [Babu, Arun, Zain]
	}
}
