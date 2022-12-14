package com.bridgelabz;

public class EmployeeWage1 {static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;
    static final int NUM_DAYS_IN_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("welcome to employee + wage computation program");

        int wage = 0;
        int totalwage = 0;
        int totalHours = 0;
        int totaldays = 1;

        while (totaldays <= 20 && totalHours <= 20) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(employeeCheck){
                case FULL_TIME_EMPLOYEE:
                    wage = PART_TIME_HOUR * WAGE_PER_HOUR;
                    totalHours += PART_TIME_HOUR;
                    break;
                default:
                    wage = 0;
            }
            totalwage = totalwage + wage;
            totaldays++;
        }
        System.out.println(totalwage);
    }
}





