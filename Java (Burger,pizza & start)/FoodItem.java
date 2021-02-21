public class FoodItem
{
	private double price;
	private String name;
	
	public FoodItem(){}
	
	public FoodItem(double price,String name)
	{
		this.price=price;
		this.name=name;
	}
	
	public void setprice(double price){this.price=price;}
	public void setname(String name){this.name=name;}
	
	public double getprice(){return price;}
	public String getname(){return name;}
	
	 public void showdetails()
	 {
		 System.out.println("PRICE:"+price);
		System.out.println("name:"+name);
	 }	 
}