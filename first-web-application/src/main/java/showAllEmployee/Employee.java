package showAllEmployee;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setDept(int Salary) {
		this.Salary = Salary;
	}

	private int Salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

}
