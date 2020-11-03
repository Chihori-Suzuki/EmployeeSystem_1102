package ca.eployee.exercise;

import java.time.LocalDate;

/**
 * 
 * @author suzukichihori
 * Create HourlyEmployee class which is child class of Employee including instance variables (payRate, hoursWorking) , 
 * constructor, getters and setters and toString (you should add totalIncome to the toString too). 
 * make sure payRate should be more than 0 and hoursWorking should be between 0 and 40. 
 * Now in this class you should provide implementation of calculateIncome.
 *
 */

public class HourlyEmployee extends Employee{
	private double payRate;
	private double hoursWorking;
	private double totalIncome;

	public HourlyEmployee(String firstName, String lastName, String email, LocalDate sDate, String phoneNumbe, double payRate, double hoursWorking) {
		super(firstName, lastName, email, sDate, phoneNumbe);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
//		calculateIncome(payRate,hoursWorking);
	}
	/**
	 * 
	 * @return payRate
	 */
	public double getPayRate() {
		if (this.payRate < 0) {
			return 0;
		} else {
			return this.payRate;
		}
	}
	/**
	 * 
	 * @return hoursWorking
	 */
	public double getHoursWorking() {
		if (this.hoursWorking >= 0 && this.hoursWorking <= 40) {
			return this.hoursWorking;
		} else {
			return 0;
		}
	}
	/**
	 * 
	 * @param payRate
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	/**
	 * 
	 * @param hoursWorking
	 */
	public void setHoursWorking(double hoursWorking) {
		this.hoursWorking = hoursWorking;
	}
	/**
	 * 
	 * @param payRate
	 * @param hoursWorking
	 * @return
	 */
	@Override
	public double calculateIncome(double payRate, double hoursWorking) {
		return super.calculateIncome(payRate, hoursWorking);
	}
	@Override
	public String toString() {
		return super.toString() + "\nPay rate : " + getPayRate() +
				"\nHours working : " + getHoursWorking() +
				"\nTotal income is " + calculateIncome(payRate,hoursWorking);
		
	}
	
	
	
}	
