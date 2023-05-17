package com.bridglabz.EmpWageComputationProblem;

public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee computation program");
        isEmployee();
    }
    public static void isEmployee(){
        int is_Full=1;
        int empHour=0;
        int empWageHour=20;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==is_Full){
             empHour=8;
            System.out.println("Employee is present");
        }else{
            empHour=0;
            System.out.println("Employee is absent");
        }
        int dailyEmp_Wage=empHour*empWageHour;
        System.out.println("Daily employee wage: "+dailyEmp_Wage);
    }
}
