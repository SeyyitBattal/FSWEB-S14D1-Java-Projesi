package com.workintech.devComp;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer");
        setSalary(getSalary() + 2000);
    }
}
