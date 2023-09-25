package com.workintech.devComp;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer");
        setSalary(getSalary() + 2000);
    }
}
