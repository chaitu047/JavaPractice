package employee.details;

public class Employee {
	private long id;
	private String name;
	private String address;
	private long phoneno;
	private double basic_salary;
	private double spl_allw;
	private double hra;

	Employee() {
		spl_allw = 250.80;
		hra = 1000.50;
	}

	Employee(long id, String name, String address, long phoneno) {
		this();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return (this.id);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return (this.name);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return (this.address);
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public long getPhoneno() {
		return (this.phoneno);
	}

	public void setBasicSalary(double basic_salary) {
		this.basic_salary = basic_salary;
	}

	public double getBasicSalary() {
		return (this.basic_salary);
	}

	public void setSplAllw(double spl_allw) {
		this.spl_allw = spl_allw;
	}

	public double getSplAllw() {
		return (this.spl_allw);
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getHra() {
		return (this.hra);
	}
	
	public double calculateSalary()
	{
		double salary = basic_salary + ( basic_salary * spl_allw/100) + ( basic_salary * hra/100);
		
		return(salary);
	}
	
	public String toString()
	{
		return("id:"+String.valueOf(this.id)+"\n"+"name:"+this.name+"\n"+"Address:"+this.address+"\n"+"phone no:"+String.valueOf(this.phoneno)+"\n"+"Basic Salary:"+String.valueOf(this.basic_salary)+"\n"+"special allowance:"+String.valueOf(this.spl_allw)+"\n"+"HRA:"+String.valueOf(this.hra)+"\n");
	}
}
