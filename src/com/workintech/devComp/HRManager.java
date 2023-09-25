package com.workintech.devComp;

import java.sql.Array;

public class HRManager extends Employee {

    private final JuniorDeveloper[] juniors;
    private final MidDeveloper[] mids;
    private final SeniorDeveloper[] seniors;

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    @Override
    public void work() {
        System.out.println("HR Manager old salary: " + getSalary());
        setSalary(getSalary() + 4000);
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try{
            if (juniors[index] == null) {
                juniors[index] = juniorDeveloper;
            }else{
                System.out.println("Index isn't empty!");
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found " + exception.getMessage());
        }






        System.out.println("Junior Developer full");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < mids.length; i++) {
            if (mids[i] == null) {
                mids[i] = midDeveloper;
                return;
            }
        }

        System.out.println("Mid Developer full");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniors.length; i++) {
            if (seniors[i] == null) {
                seniors[i] = seniorDeveloper;
                return;
            }
        }

        System.out.println("Senior Developer full");
    }


}
