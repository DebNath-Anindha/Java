public class CS extends Department{
	private int credit;
	
	
	
	public CS()
	{
		
		System.out.println("Empty Constector Called ");
	}
 
	public CS (String depName,int creditFee,int credit)
	{
		super(depName,creditFee);
		System.out.println("Valued Constector Called ");
	    this.depName=depName;
		 this.creditFee=creditFee;
		this.credit=credit;
	}
	
	public void setValues(String depName,int creditFee,int credit)
	{
		super.setValues(depName,creditFee);
		this.credit=credit;
	
	}
	
	
	public void show()
	{
		super.show();
		System.out.println("Credit : " +this.credit);
	}
	
	
	
}