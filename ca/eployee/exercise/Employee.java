package ca.eployee.exercise;
import java.time.LocalDate;

/**
 * 
 * @author suzukichihori
 * 
 *Create Employee class including instance variables (first name, last name, email, start date, phone number), constructor, 
 *getters and setter and toString. make sure each instance variable except start date should be checked not to be null or empty. 
 *In this class we need another method called calculateIncome which the body of this method depends on child classes. 
 *so we need only the header of the method. 
 */

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNumber;
	private double totalIncome;
	
	public Employee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNumber(phoneNumber);
		
	}
	/**
	 * 
	 * @param rate
	 * @param hours
	 * @return
	 */
	public double calculateIncome(double rate, double hours) {
		totalIncome = rate * hours;
		return totalIncome;
	}
	/**
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		if(firstName.isEmpty() || firstName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return firstName;
		}
	}
	/**
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		if(lastName.isEmpty() || lastName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return lastName;
		}
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		if(email.isEmpty() || email.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return email;
		}
	}
	/**
	 * 
	 * @return startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/**
	 * 
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		if(phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return phoneNumber;
		}
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Name : " + getFirstName() + " " + getLastName() +
				"\nEmail : " + getEmail() + 
				"\nStart Date : " + getStartDate();
	}
	
}
