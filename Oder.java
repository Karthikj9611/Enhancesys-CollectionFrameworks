import java.util.ArrayList;
public class Oder 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("Forward Direction");
		for(int i=0;i<al.size();i++)		// iteration :forward direction
		{
			String str1=al.get(i);
			System.out.println(str1);
		}
		
		System.out.println("Reverse Direction");
		for(int i=al.size()-1;i>=0;i--)		// iteration:reverse direction
		{
			String str2=al.get(i);
			System.out.println(str2);
		}
		
		System.out.println("Using for-each loop forward Direction");
		for(String str3:al) {
			System.out.println(str3);
		}
	}
}

//		Forward Direction
//		A
//		B
//		C
//		D
//		Reverse Direction
//		D
//		C
//		B
//		A
//		Using for-each loop forward Direction
//		A
//		B
//		C
//		D

