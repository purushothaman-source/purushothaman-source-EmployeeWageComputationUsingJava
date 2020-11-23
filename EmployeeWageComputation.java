package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();
			int randomnum =random.nextInt(2);
			 int isPresent=1;
			 int salary;
			System.out.println("RandomNumber :"+randomnum);	
			if( randomnum == isPresent  )
			{
				        System.out.println("Employee is Present!");
				         int empHrs=8;
				        int  ratePerHour=20;
				         salary= empHrs * ratePerHour;
			}
			else {
				        System.out.println("Employee is absent!");
				         salary=0;
			}			
				System.out.println( "Salary:" +salary);
			

	}

}
