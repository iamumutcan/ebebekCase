package ebebekCase;

public class Employee {
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	private String name;
	private int salary;
	private int workHours;
	private int hireYear;

	public double tax() {
		double taxPayment = 0;
		if (this.salary > 1000) {
			taxPayment = this.salary * 3 / 100;
		}
		return taxPayment;
	}

	public double bonus() {
		double bonusPayment = 0;
		if (this.workHours > 40) {
			bonusPayment = (this.workHours - 40) * 30;
		}
		return bonusPayment;
	}

	public double raiseSalary() {
		int increaseSalary = 0;
		int howManyYears = 2021 - this.hireYear;
		if (howManyYears > 19) {
			increaseSalary = this.salary * 15 / 100;
		} else if (howManyYears < 20 && howManyYears > 9) {
			increaseSalary = this.salary * 10 / 100;
		} else {
			increaseSalary = this.salary * 5 / 100;
		}
		return increaseSalary;
	}
	public String toString() {
		double newSalary=this.salary-this.tax()+this.bonus();
		double totalSalary=newSalary+this.raiseSalary();
		String mesaj="Adı:"+ this.name+"\n"
				+ "Maaşı: "+ this.salary+"\n"
				+ "Çalışma "+ this.workHours+"\n"
				+ "Başlagıç Yılı:"+ this.hireYear+"\n"
				+ "Vergi : "+this.tax()+"\n"
				+ "Bonus : "+this.bonus()+"\n"
				+ "Maaş Artışı:"+this.raiseSalary()+"\n"
				+ "Vergi ve Bonuslar ile birlikte maaş: "+newSalary+"\n"
				+ "Toplam maaş: "+totalSalary;
		return mesaj;
	}
}
