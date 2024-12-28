package PojoPractice;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Payload {
	
		
	public void createUser throws JacksonException  {
		
		NestedPojoPractice requestpayload = new NestedPojoPractice();
		requestpayload.setCompanyName("XYZ Ltd");
		requestpayload.setStreet("Africa Avenue");
		requestpayload.setCity("Delhi");
		requestpayload.setState("New Delhi");
		requestpayload.setPincode(123456);
		
		List banks = new ArrayList();
		banks.add("HDFC");
		banks.add("SBI");
		banks.add("AXIS");
		requestpayload.setBankaccounts(banks);
				
		EmployeesPojo employeelist1 = new EmployeesPojo();
		EmployeesPojo employeelist2 = new EmployeesPojo();
		AddressPojo adress1 = new AddressPojo();
		
		employeelist1.setFirstName("Akshay");
		employeelist1.setLastName("Mehra");
		employeelist1.setGender("Male");
		employeelist1.setAge("40");
		employeelist1.setSalary("10000.57");
				
		adress1.setStreet("abc");
		adress1.setCity("PQR");
		adress1.setState("Maharashtra");
		
		employeelist1.setAddress(adress1);
		
		employeelist2.setFirstName("Kavita");
		employeelist2.setLastName("Gahunje");
		employeelist2.setGender("Female");
		employeelist2.setAge("30");
		employeelist2.setSalary("10000.90");
			
		adress1.setStreet("noida");
		adress1.setCity("Greater Noida");
		adress1.setState("Maharashtra");
		
		employeelist2.setAddress(adress1);
		
		List allemployees = new ArrayList();
		allemployees.add(employeelist1);
		allemployees.add(employeelist2);
		
		requestpayload.setEmployees(allemployees);
		
		ObjectMapper obj = new ObjectMapper();
		String reqbody = obj.writerWithDefaultPrettyPrinter().writeValueAsString(requestpayload);
					
		System.out.println(reqbody);
			
	}
	
}