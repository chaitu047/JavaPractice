package employee.details;

public class Manager extends Employee{
	Manager()
	{
		super();
	}
	Manager(long id, String name, String address, long phoneno, double basic_salary)
	{
		super();
		setId(id);
		setName(name);
		setAddress(address);
		setPhoneno(phoneno);
		setBasicSalary(basic_salary);
	}
}
