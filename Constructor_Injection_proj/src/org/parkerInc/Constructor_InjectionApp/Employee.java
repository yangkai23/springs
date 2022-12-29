package org.parkerInc.Constructor_InjectionApp;

public class Employee {
	private int no_of_employees;
	private double total_salary;
	public Employee(int no_of_employees, double total_salary) {
		this.no_of_employees = no_of_employees;
		this.total_salary = total_salary;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\nEmployee Count: "+no_of_employees+"\nTotal Salary Paid: "+total_salary);
		return sb.toString();
	}

}
