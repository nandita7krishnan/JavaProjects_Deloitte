package assignment;


public class EmplyeeVo {
	private int empid;
	private String empname;
	private double annualincome;
    private double incometax;
    
	public EmplyeeVo(int empid, String empname, double annualincome, double incometax) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;
		this.incometax = incometax;
	}
	public EmplyeeVo() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getAnnualincome() {
		return annualincome;
	}
	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}
	public double getIncometax() {
		return incometax;
	}
	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Name : "+ empname+ "ID : "+empid+"Income: "+ annualincome+ "Tax: "+incometax+"/n";
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return super.equals(obj);
    }
    
    
}