package PojoPractice;

import java.util.List;

public class NestedPojoPractice {

	private String companyName;
	private String Street;
	private String City;
	private String State;
	private int Pincode;
	private List<String> Bankaccounts;
	private List <EmployeesPojo> employees;
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public List<String> getBankaccounts() {
		return Bankaccounts;
	}
	public void setBankaccounts(List<String> bankaccounts) {
		Bankaccounts = bankaccounts;
	}
	public List <EmployeesPojo> getEmployees() {
		return  employees;
	}
	public void setEmployees(List <EmployeesPojo> employees) {
		this.employees =  employees;
	}
	
}
