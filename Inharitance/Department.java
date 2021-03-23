import java.lang.*;
 public class Department 
 {
	 protected String depName;
	 protected int creditFee;
 
 
 
	public Department()
	{
		super();
		System.out.println("Empty Constector Called");
	}
 
	public Department(String depName,int creditFee)
	{
		System.out.println("Valued Constector Called ");
		depName=depName;
		creditFee=creditFee;
	}
	
	public void setValues(String depName,int creditfee)
	{
		depName=depName;
		creditFee=creditFee;
	
	}
	
	public void show()
	{
		System.out.println("Department Name : " +depName);
		System.out.println("Credit Fee : " +creditFee);
	}
 }
 
 