package Appenmeier.Kapitel63;

/**
 * Mitarbeiter
 * 
 * @author Daniel Appenmaier
 *
 */
public class Employee {

	/*
	 *  Attribute
	 */
	private int employeeId;
	private Person person;
	private int salary;

	/*
	 *  Methoden
	 */
	public Employee(Person person, int salary) {
		this.person = person;
		this.salary = salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return person.getName();
	}

	public void setSalary(int moneygain) throws SalaryIncreaseTooHighException, SalaryDecreaseException{
		if(moneygain > (this.salary*110/100)){
			throw new SalaryIncreaseTooHighException();
		} else if (moneygain < 0){
			throw new SalaryDecreaseException();
		} else {
			this.salary += moneygain;
		}

	}

	public int getSalary() {
		return salary;
	}

	public void print() {
		System.out.println(employeeId + " - " + person.getName() + " - " + salary + "€");
	}

}
