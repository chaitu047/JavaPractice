package employee.details;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager empmanager = new Manager(28564,"James","Chennai_India",552635,60000);
		Trainee emptrainee = new Trainee(29846,"Jack","Mumbai_India",442085,45000);
		System.out.println(empmanager+"Salary:"+empmanager.calculateSalary());
		System.out.println("_______________________________________________________________________________________________");
		System.out.println(emptrainee+"Salary"+emptrainee.calculateSalary());
	}

}
