public class Pizza extends FoodItem
{
	private String size;
	
	public Pizza(){}
	public Pizza(String size,double price,String name)
	{
		super(price,name);
		this.size=size;
		setprice(price);
		setname(name);
	
	}
	public void setsize(String size)
	{
		this.size=size;
	}
	public String getsize()
	{
		return size;
	}
	public void showpizzaall()
	{
		
		System.out.println("name it is for parameterized conss and name:"+getname());
		System.out.println("size it is for parameterized conss and price:"+getprice()+" taka");
		System.out.println("size it is for parameterized conss and size:"+getsize());
	}
}