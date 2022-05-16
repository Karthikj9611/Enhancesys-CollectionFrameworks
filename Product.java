import java.util.*;

public class Product 
{
	int price;
	double qty;
	String type;
	
	public Product(int price, double qty, String type) {
		this.price = price;
		this.qty = qty;
		this.type = type;
	}
	public static void main(String[] args)
	{
		Product p1=new Product(1200,1,"waterbottle");
		Product p2=new Product(1400,3,"Shampoo");
		
		LinkedList<Product> lst=new LinkedList<Product>();
		lst.add(p1);
		lst.add(p2);
		
		// To add at specified index
		Product p3=new Product(5000, 1, "Mobile");
		lst.add(2,p3);
		
		for(Product res:lst)
		{
			System.out.println(res.price+" "+res.qty+" "+res.type);
		}
	}
}
