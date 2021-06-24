package javatutorial;

import java.util.Scanner;

class Staff
{
	int staff_id;
	String name;
	Staff(int x,String y)
	{
		this.staff_id=x;
		this.name=y;
	}
}

class Teacher extends Staff
{
	String subject;
	String publication;
	Teacher(int a,String x,String y,String z)
	{
		super(a,x);
		this.subject=y;
		this.publication=z;
	}
}

class Typist extends Staff
{
	int speed;
	Typist(int x,String y,int z)
	{
		super(x,y);
		this.speed=z;
	}
}

class Officer extends Staff
{
	String grade;
	Officer(int x,String y,String z)
	{
		super(x,y);
		this.grade=z;
	}
}

class RegularTypist extends Typist
{
	double reg_salary;
	RegularTypist(int x,String y,int z,double s)
	{
		super(x,y,z);
		this.reg_salary=s;
	}
}

class CasualTypist extends Typist
{
	double daily_wage;
	CasualTypist(int x,String y,int z,double w)
	{
		super(x,y,z);
		this.daily_wage=w;
	}
}


public class SchoolDb {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type=0,id,speed;
		double salary=0,wage=0;
		boolean b=true,c=true;
		String name,grade,temp,subject,textbook;
		Scanner scan = new Scanner(System.in);
		Teacher te=null;;
		Officer of=null;
		RegularTypist rt=null;
		CasualTypist ct=null;
		System.out.println("Enter Educational Institute Details");
		System.out.println("Enter designation");
		while(b)
		{
			System.out.println("1.Teacher\t2.Officer\n3.Typist");
		
			type=scan.nextInt();

			SWITCH: switch(type)
		
			{
		
			case 1 : System.out.println("Enter id");
				 	 id=scan.nextInt();
				 	 System.out.println("Enter name");
				 	 temp=scan.nextLine();
				 	 name=scan.nextLine();
				 	 System.out.println("Enter Subject");
				 	 subject=scan.nextLine();
				 	 System.out.println("Enter Publication");
				 	 textbook=scan.nextLine();
				 	 te = new Teacher(id,name,subject,textbook);
				 	 break SWITCH;
			case 2:	 System.out.println("Enter id");
					 id=scan.nextInt();
					 System.out.println("Enter name");
					 temp=scan.nextLine();
					 name=scan.nextLine();
					 System.out.println("Enter Grade");
					 grade=scan.nextLine();
					 of = new Officer(id,name,grade);
					 break SWITCH;
			case 3:	 System.out.println("Enter id");
					 id=scan.nextInt();
					 System.out.println("Enter name");
					 temp=scan.nextLine();
					 name=scan.nextLine();
					 System.out.println("Enter Speed");
					 speed=scan.nextInt();
					 System.out.println("Enter 1.Regular Typist \t 2.Casual Typist");
					 type=scan.nextInt();
					 switch(type)
					 {
					 case 1: System.out.println("Enter salary of regular typist");
						  	 salary=scan.nextDouble();
					 		 rt = new RegularTypist(id,name,speed,salary);
					 		 break SWITCH;
					 case 2: System.out.println("Enter daily wage of casual typist");
						 	 wage=scan.nextDouble();
					 		 ct = new CasualTypist(id,name,speed,salary);
					 		 break SWITCH;
					 default:System.out.println("Enter a valid option");
					 }
					 break SWITCH;
			default: System.out.println("Enter a valid option");
					 break SWITCH;
			}
		System.out.println("Enter 0 to exit 1 to continue");
		type=scan.nextInt();
		if(type<=0 || type>1)
		{
			b=false;
		}
		else
		{
			b=true;
		}
	}
	
		System.out.println("Deatils of Staff");
		System.out.println("Choose the option");
		System.out.println("1.Teacher\t2.Officer\n3.Regular Typist\t4.Casual Typist\5.ALL");
		while(c)
		{
			type=scan.nextInt();
			if(type<1 || type>5)
			{
				System.out.println("Enter a valid choice");
			}
			else
			{
				if(type==1)
				{
					System.out.println("Teacher\nid:"+te.staff_id+"\tname:"+te.name+"\tsubject:"+te.subject+"\tpublication:"+te.publication+"\n");
				}
				else if(type==2)
				{
					System.out.println("Officer\nid:"+of.staff_id+"\tname:"+of.name+"\tGrade:"+of.grade+"\n");
				}
				else if(type==3)
				{
					System.out.println("Typist_Regular\nid:"+rt.staff_id+"\tname:"+rt.name+"\tSalary:"+rt.reg_salary+"\n");
				}
				else if(type==4)
				{
					System.out.println("Typist_Casual\nid:"+ct.staff_id+"\tname:"+ct.name+"\tSalary:"+ct.daily_wage+"\n");
				}
				else
				{
					if((rt==null && ct==null) || te==null || of==null)
					{
						System.out.println("Some of the Details are not preasent");
					}
					else
					{
						System.out.println("Teacher\nid:"+te.staff_id+"\tname:"+te.name+"\tsubject:"+te.subject+"\tpublication:"+te.publication+"\n");
						System.out.println("Officer\nid:"+of.staff_id+"\tname:"+of.name+"\tGrade:"+of.grade+"\n");
						if(rt!=null)
						{
							System.out.println("Typist_Regular\nid:"+rt.staff_id+"\tname:"+rt.name+"\tSalary:"+rt.reg_salary+"\n");
						}
						else
						{
							System.out.println("Typist_Casual\nid:"+ct.staff_id+"\tname:"+ct.name+"\tSalary:"+ct.daily_wage+"\n");
						}
					}
				}
			}
			System.out.println("Enter 1.To Continue 0.To Exit");
			type=scan.nextInt();
			if(type<=0 || type>1)
			{
				c=false;
			}
			else
			{
				c=true;
			}
		}
		scan.close();
		
	}

}


