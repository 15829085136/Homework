package demo;

abstract class Employee{
	public abstract double earings();
}


class YearWorker extends Employee{
	private int year;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public int getYear() {
		return year;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public YearWorker(int year,double salary) {
		this.salary=salary;
		this.year=year;
	}
	  
	public double earings() {
		return salary*year;
	}
}

class MonthWorker extends Employee{
	private int month;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MonthWorker(int month,double salary) {
		this.month=month;
		this.salary=salary;
	}
	  
	public double earings() {
		return salary*month;
	}
}

class DayWorker extends Employee{
	private int day;
	private double salary;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public DayWorker(int day,double salary) {
		this.day=day;
		this.salary=salary;
	}
	  
	public double earings() {
		return salary*day;
	}
}
public class Company {
	Employee[] em=new Employee[3];
	public Company(Employee[] em) {
		this.em=em;
		em[0]=new YearWorker(1,120000);
		em[1]=new MonthWorker(10,8000);
		em[2]=new DayWorker(40,1000);
	}
	public void sum(){
		double sum;
		sum=em[0].earings()+em[1].earings()+em[2].earings();
		System.out.println(sum);
	}
	public static void main(String[] args){
		Employee[] em=new Employee[3];
		Company c=new Company(em);
		c.sum();
	}
}
