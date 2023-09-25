package com.workintech.devComp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDEVELOPER COMPANY\n");

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Battal ", 1000);
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Ali ", 1500);
        juniorDeveloper2.work();
        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Emre ", 2500);
        midDeveloper1.work();
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(4, "Serkan ", 3000);
        seniorDeveloper1.work();

        HRManager hrManager = new HRManager(1, "Dogancan ", 6000, new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();


        hrManager.addEmployee(0, juniorDeveloper1);
        System.out.println(hrManager);

        System.out.println("HR Manager: " + hrManager.getName() + ", Salary: " + hrManager.getSalary());

    }
}
