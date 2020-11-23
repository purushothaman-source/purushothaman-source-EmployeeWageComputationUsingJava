package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();	
	    	int IS_PART_TIME=1; 
	    	 int IS_FULL_TIME=2; 
	    	int EMP_RATE_PER_HR=20;
	    		int	MAX_HRS_IN_MONTH=100;
	    		int	NUM_WORKING_DAYS=20 ;
	    		int	totalEmpHrs=0 ;
	    		int	totalWorkingDays=0;  
	    		int randomnum;
	    		int empHrs;
	    		int totalSalary;
	    			while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ) 
	    			{
	    			                totalWorkingDays++; 
	    			                System.out.println("Total working day:" +totalWorkingDays);
	    			                randomnum=random.nextInt(3); 
	    			         switch(randomnum)
	    			         {
	    			         case 1: empHrs=4; 
	    			                  break; 
	    			         case 2: empHrs=8 ;
	    			                   break; 
	    			          default: empHrs=0; 
	    			         }
	    			          totalEmpHrs=(  totalEmpHrs + empHrs ); 
	    			          System.out.println("Total Employee Hours: "+totalEmpHrs); 
	    			}
	    			totalSalary=(  totalEmpHrs * EMP_RATE_PER_HR);
	    			System.out.println( "Total Salary: "+totalSalary);



}
}
