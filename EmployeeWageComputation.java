package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();
			int randomnum =random.nextInt(3);
			int isPresent=1;
			int salary;
			System.out.println("RandomNumber :"+randomnum);	
		        int IS_PART_TIME=1 ;
			int	IS_FULL_TIME=2; 
			 int	EMP_RATE_PER_HR=20;
	        	  int empHrs;
					 
			if( randomnum == IS_PART_TIME ) 
			   empHrs=4;
			else if( randomnum == IS_FULL_TIME) 
			    empHrs=8; 
			else 
			    empHrs=0; 
			System.out.println( "Employee hours: " +empHrs );
			salary=( empHrs * EMP_RATE_PER_HR );
			System.out.println( "Salary:" +salary); 
				}

}
