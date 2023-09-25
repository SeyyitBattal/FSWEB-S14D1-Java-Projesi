package com.workintech.devComp;

public class MidDeveloper extends SeniorDeveloper {

    public MidDeveloper(int id, String name, double salary){
        super(id, name, salary);
        setSalary(35000);
    }

    @Override
    public void work() {
        System.out.println("Mid level starts to working");
    }



}
