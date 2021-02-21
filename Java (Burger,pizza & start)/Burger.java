public class Burger extends FoodItem
{
	private int numberofpatties;
	
	public Burger()
	{}
	public Burger(int numberofpatties,double price,String name)
	{
		super(price,name);
		this.numberofpatties=numberofpatties;
		
	}
	public void setnumberofpatties(int numberofpatties)
	{
		this.numberofpatties=numberofpatties;
	}
	public int getnumberofpatties()
	{
		return numberofpatties;
	}
	
	public void showburgerall()
	{

		System.out.println("name:"+getname());
		System.out.println("price:"+getprice()+" taka");
		System.out.println("patties:"+getnumberofpatties());
	}
	
}