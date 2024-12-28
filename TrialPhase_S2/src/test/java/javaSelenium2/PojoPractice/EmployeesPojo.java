package PojoPractice;

public class EmployeesPojo {

	
	private String firstName;
	private String lastName;
	private String gender;
	private String Age;
	private String Salary;
	private AddressPojo address;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public AddressPojo getAddress() {
		return address;
	}
	public void setAddress(AddressPojo address) {
		this.address = address;
	}
	
}
