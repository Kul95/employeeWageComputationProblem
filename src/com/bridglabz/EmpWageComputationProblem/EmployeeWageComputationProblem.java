package com.bridglabz.EmpWageComputationProblem;

public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee computation program");
        isEmployee();
    }
    public static void isEmployee(){
        int is_Full=1;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==is_Full){

            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
