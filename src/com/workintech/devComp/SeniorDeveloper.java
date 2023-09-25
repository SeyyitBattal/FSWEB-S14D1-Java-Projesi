package com.workintech.devComp;

public class SeniorDeveloper extends HRManager {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
        setSalary(45000);
    }

    @Override
    public void work() {
        System.out.println("Senior starts to working");
    }


}
