package employee;

public class Employee {
	private String name;
	public double salary;
	private int workHours,hireYear;//Üzerinde oynama yapamayacağım için private aldım.
	
	Employee(int hireYear,int workHours,double salary,String name){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public double tax() {//içerideki veriyi kullandığı için parantez içi boş kalır.
		if(this.salary>=1000) {
			return this.salary*0.03;
		}
		else {
			return 0.0;
		}
		}
	public double bonus() {
		int extraHours=this.workHours-40;
		if(extraHours>0) {
		return 30* this.workHours;
		}
		return 0.0;
	}
	public double increase() {
		int year=2020-this.hireYear;
		if(year<10) {
			return this.salary*0.5;
		}
		else if(year>=10 && year<20) {
			return this.salary*0.10;
		}
		else {
			return this.salary*0.15;
		}
	}
	public void toString(Employee emp) {
		System.out.println("Tax: "+emp.tax());
	    System.out.println("Bonus: "+emp.bonus());
	    System.out.println("Increase salary: "+emp.increase());
	    double totalSalary=emp.salary-emp.tax()-emp.bonus();
	    System.out.println("Total salary with tax and bonus: "+totalsalary);
	    System.out.println("Total salary with the raise of salary: "+(emp.salary+emp.increase()));
	}
}
