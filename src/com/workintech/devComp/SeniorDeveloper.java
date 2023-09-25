package com.workintech.devComp;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " Senior Developer started work");
        setSalary(getSalary() + 3000);
    }
}
