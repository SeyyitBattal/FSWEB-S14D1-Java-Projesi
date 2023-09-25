package com.workintech.devComp;

public class JuniorDeveloper extends MidDeveloper {

    public JuniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
        setSalary(25000);
    }

    @Override
    public void work() {
        System.out.println("Junior starts to working");
    }





}
