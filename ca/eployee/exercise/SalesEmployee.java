package ca.eployee.exercise;

import java.time.LocalDate;

/**
 * 
 * @author suzukichihori
 * Create SalesEmployee class which is child class of Employee including instance variables (commitionRate, totalSales), 
 * constructor, getters and setters and toString (you should add totalIncome to the toString too). 
 * make sure both instance variables should be more than zero. Now in this class you should provide implementation of calculateIncome.
 * 
 */
public class SalesEmployee extends Employee {
	private double commitionRate;
	private double totalSales;
	

	public SalesEmployee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumbe, double commitionRate, double totalSales) {
		super(firstName, lastName, email, startDate, phoneNumbe);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
//		calculateIncome(commitionRate,totalSales);
	}
	/**
	 * 
	 * @return commitionRate
	 */
	public double getCommitionRate() {
		if (commitionRate <= 0) {
			return 1;
		}else {
			return this.commitionRate;
		}
	}
	/**
	 * 
	 * @return totalSales
	 */
	public double getTotalSales() {
		if (totalSales <= 0) {
			return 1;
		}else {
			return this.totalSales;
		}
	}
	/**
	 * 
	 * @param commitionRate
	 */
	public void setCommitionRate(double commitionRate) {
		this.commitionRate = commitionRate;
	}
	/**
	 * 
	 * @param totalSales
	 */
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	/**
	 * 
	 * @param commitionRate
	 * @param totalSales
	 * @return
	 */
	@Override
	public double calculateIncome(double commitionRate, double totalSales) {
		return super.calculateIncome(commitionRate, totalSales);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCommition rate : " + getCommitionRate() +
				"\nTotal sales : " + getTotalSales() +
				 "\nTotal income : " + calculateIncome(commitionRate, totalSales);
		
	}
	
	
}
