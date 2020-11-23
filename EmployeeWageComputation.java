package com.javaPrograms.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	    public static void main(String[] args) {
	    	Random random =new Random();
			int randomnum =random.nextInt(2);
			 int isPresent=1;
			System.out.println("RandomNumber :"+randomnum);	
			if( randomnum == isPresent  )
		                  System.out.println("Employee is Present!");
			else
	 				      System.out.println("Employee is absent!");
					


	}

}
