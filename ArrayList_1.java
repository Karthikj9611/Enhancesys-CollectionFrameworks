import java.util.ArrayList;
import java.util.Collection;
public class ArrayList_1 
{
	public static void main(String[] args) 
	{
		Collection<String> col1=new ArrayList<String>();
		col1.add("Robert");
		col1.add("Alex");
		col1.add("Rick");
		col1.add("Edward");
		
		Collection<String> col2=new ArrayList<String>();
		col2.add("Modi");
		col2.add("Rahul");
		col2.add("Amith");
		
		Collection<String> res=new ArrayList<String>();
		res.addAll(col1);
		res.addAll(col2);
		
		System.out.println(res.size());				// 7
		System.out.println(res.isEmpty());			// false
		
		col1.remove("Robert");
		System.out.println(col1);					// [Alex, Rick, Edward]
		
		res.containsAll(col2);
		System.out.println(res);					// [Robert, Alex, Rick, Edward, Modi, Rahul, Amith]
		
		res.removeAll(col2);
		System.out.println(res);					// [Robert, Alex, Rick, Edward]
				

		res.clear();
		System.out.println(res); 					// []
		
		System.out.println(col2.contains("Rahul"));	// true
		
		Object[] arr=res.toArray();
		System.out.println(arr);					// [Ljava.lang.Object;@15db9742
	}
}
