package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(super.getName() + " junior developer begins to work");
    }

    public void work(double salary){
        super.setSalary(salary);
        System.out.println(super.getName() + " junior developer begins to work");
    }
}
