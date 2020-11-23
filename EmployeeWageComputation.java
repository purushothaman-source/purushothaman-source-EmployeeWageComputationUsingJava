package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();
			int randomnum =random.nextInt(3);
			System.out.println("RandomNumber :"+randomnum);	
              int salary;
              int empHrs;
				int EMP_RATE_PER_HR=20;
				switch (randomnum) {
				case 1:empHrs=4;
					   break;          
				case 2 :empHrs=8;
				       break;
				 default:
				       empHrs=0;
				}				
					System.out.println("Employee hours: "+empHrs); 
					salary=( empHrs * EMP_RATE_PER_HR ); 
					System.out.println("Salary: "+salary);

	

}
}
