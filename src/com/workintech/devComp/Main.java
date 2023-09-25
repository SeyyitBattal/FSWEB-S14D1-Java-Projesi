package com.workintech.devComp;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDEVELOPER COMPANY\n");

        HRManager hrManager = new HRManager(1, "Doğancan Kınık", 5000);

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2, "Oğuzhan", 1000);
        MidDeveloper midDeveloper = new MidDeveloper(3, "Emre", 2500);
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(4, "Serkan", 3000);

        hrManager.addEmployee(juniorDeveloper);
        hrManager.addEmployee(midDeveloper);
        hrManager.addEmployee(seniorDeveloper);

        System.out.println("HR Manager: " + hrManager.getName() + ", Salary: " + hrManager.getSalary());
        System.out.println("Junior Developer: " + juniorDeveloper.getName() + ", Salary: " + juniorDeveloper.getSalary());
        System.out.println("Mid Developer: " + midDeveloper.getName() + ", Salary: " + midDeveloper.getSalary());
        System.out.println("Senior Developer: " + seniorDeveloper.getName() + ", Salary: " + seniorDeveloper.getSalary() + "\n");

        hrManager.work();
        juniorDeveloper.work();
        midDeveloper.work();
        seniorDeveloper.work();

        //Salary Uptaded
        System.out.println("\nHR Manager uptaded salary: " + hrManager.getSalary());
        System.out.println("Junior Developer uptaded salary: " + juniorDeveloper.getSalary());
        System.out.println("Mid Developer uptaded salary: " + midDeveloper.getSalary());
        System.out.println("Senior Developer uptaded salary: " + seniorDeveloper.getSalary());
    }
}
