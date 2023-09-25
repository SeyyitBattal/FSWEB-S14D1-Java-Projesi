package com.workintech.devComp;

import java.sql.Array;

public class HRManager extends Employee {

    private String[] JuniorDeveloper;
    private String[] MidDeveloper;
    private String[] SeniorDeveloper;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        setSalary(50000);
    }

    public void addEmployee(String[] JuniorDeveloper, String[] MidDeveloper, String[] SeniorDeveloper) {
        this.JuniorDeveloper = JuniorDeveloper;
        this.MidDeveloper = MidDeveloper;
        this.SeniorDeveloper = SeniorDeveloper;
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }


}
