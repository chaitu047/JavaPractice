package javatutorial;
import java.util.Scanner;

public class AddComplex {
	double real,img;
	AddComplex(double r,double i)
	{
		this.real=r;
		this.img=i;
	}
	public static AddComplex sum(AddComplex a, AddComplex b)
	{
		AddComplex temp = new AddComplex(0,0);
		temp.real= a.real+b.real;
		temp.img=a.img+b.img;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int reala,complexa,realb,complexb;
		System.out.println("enter complex number 1");
		reala=scan.nextInt();
		complexa=scan.nextInt();
		System.out.println("Enter complex number 2");
		realb=scan.nextInt();
		complexb=scan.nextInt();
		scan.close();
		AddComplex numa = new AddComplex(reala,complexa);
		AddComplex numb = new AddComplex(realb,complexb);
		AddComplex temp=sum(numa,numb);
		System.out.println("sum is real="+temp.real+"imag ="+temp.img);
	}

}
