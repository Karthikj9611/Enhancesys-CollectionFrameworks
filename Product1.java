import java.util.*;
public class Product1
{
	int price;
	double qty;
	String type;
	public Product1(int price, double qty, String type) 
	{
		this.price = price;
		this.qty = qty;
		this.type = type;
	}
	public static void main(String[] args)
	{
		Product p1=new Product(1200, 1, "waterbottle");
		Product p2=new Product(1400, 3, "Shampoo");
		Product p3=new Product(5000, 1, "Mobile");
		LinkedList<Product> lst = new LinkedList<Product>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		for(Product p:lst) {
			System.out.println(p.qty+" "+p.type+" "+p.price);
		}
	}
}

//		1.0 waterbottle 1200
//		3.0 Shampoo 1400
//		1.0 Mobile 5000
