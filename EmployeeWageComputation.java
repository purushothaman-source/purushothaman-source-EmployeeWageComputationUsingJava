package com.javaPrograms.employeeWageComputation;

import java.util.Random;

class EmpWageForMultipleCompany{
	 public static final int IS_PART_TIME=1;
	 public static final int IS_FULLTIME=1;
	 
	 public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	 {
		 int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		 Random random =new Random();
		 while(totalEmpHrs <=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		 {
			 totalWorkingDays++;
			 int empCheck =random.nextInt(3);
			 switch (empCheck) {
			 case 1 :
				 empHrs=4;
				 break;
			 case 2:
				 empHrs=8;
				 break;
			default:
				 empHrs=0;
			 }
			 totalEmpHrs+=empHrs;
			 System.out.println("Day :"+totalWorkingDays +" Emp Hr:" +empHrs);
		 }
		 int totalEmpWage =totalEmpHrs *empRatePerHour;
		 System.out.println("Total Emp Wage for Company: "+company+" is:" +totalEmpWage);
		 return totalEmpWage;
	 }
}
public class EmployeeWageComputation{
	public static void main(String[]args) {
		EmpWageForMultipleCompany.computeEmpWage("TCS",20,2,10);
		EmpWageForMultipleCompany.computeEmpWage("Accenture",10,4,20);
		
	}
}

