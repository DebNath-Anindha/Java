public class problem implements calculator,sciencetific
{
	public int x;
	public int y;
	public int result;
	public int sum(int x,int y)
	{
		this.x=x;
		this.y=y;
		this.result=x+y;
		return result;
	}
	public int sub(int x,int y)
	{
		this.x=x;
		this.y=y;
		this.result=x-y;
		return result;
	}
	
	public int multiplication(int x,int y)
	{
		this.x=x;
		this.y=y;
		this.result=x*y;
		return result;
	}
	public int division(int x,int y)
	{
		this.x=x;
		this.y=y;
		this.result=x/y;
		return result;
	}
	public void showResult()
	{
		System.out.println("result:"+result);
	}
	
}