package ca.eployee.exercise;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 * @author suzukichihori
 * And Finally create Driver class. In the Driver class, create two objects of HourlyEmployee and two objects of SalesEmployee. 
 * create the ArrayList with Employee datatype and add the objects of (HourlyEmployee and SalesEmployee) to the arrayList. 
 * Iterate through arrayList and print the information of each objects. 
 */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate startDay1 = LocalDate.of(2020, 4, 12);
		LocalDate startDay2 = LocalDate.of(2020, 5, 25);
		
		HourlyEmployee hourEmp = new HourlyEmployee("Emilis", "Wagner", "AAA@gmail.com", startDay1 , "112-1231-1231", 12.0, 10.0);
		SalesEmployee salesEmp = new SalesEmployee("Bianka", "Suarez", "BBB@gmail.com", startDay2 , "112-1231-1231", 5.0, 10.0);
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(hourEmp);
		emp1.add(salesEmp);
		
		for(Employee e : emp1) {
			System.out.println(e.toString() + "\n");
		}
		
	}
}
