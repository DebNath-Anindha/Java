public class BBA extends Department{
	private int credit;
	
	
	
	public BBA()
	{
		
		System.out.println("Empty Constector Called ");
	}
 
	public BBA (String depName,int creditFee,int credit)
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