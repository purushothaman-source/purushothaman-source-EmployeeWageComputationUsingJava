package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();	
              int salary;
              int empHrs;
            	int	 EMP_RATE_PER_HR=20; 
            		int NUM_WORKING_DAYS=20; 
            		  int totalSalary=0 ;
            		  for(int day=1  ; day <= NUM_WORKING_DAYS; day++  ) 
            		  {
            			  int randomnum =random.nextInt(3);
            		          switch(randomnum) {  
            		          case 1: empHrs=4 ;
            		                   break; 
            		          case 2: empHrs=8 ;
            		                   break; 
            		           default: empHrs=0; 
            		          }    
            		      salary=(  empHrs * EMP_RATE_PER_HR); 
            		           System.out.println("Day: "+day+"--->>>>"+  "Salary:" +salary); 
            		        totalSalary=(  totalSalary + salary );
            		  }
            		          
            		  System.out.println( "Total Salary:" +totalSalary);
	

}
}
