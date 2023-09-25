package com.workintech.devComp;


public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Seyyit");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Elif");
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Gulsu");
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Anil");
        midDeveloper1.work();
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Burak");
        seniorDeveloper1.work();
        System.out.println(seniorDeveloper1.getSalary());

        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2],
                new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        //hrManager.addEmployee(2, juniorDeveloper2);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(1, midDeveloper2);
        hrManager.addEmployee(0, seniorDeveloper1);

        System.out.println(hrManager);
    }
}


public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Seyyit");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Elif");
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Gulsu");
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Anil");
        midDeveloper1.work();
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Burak");
        seniorDeveloper1.work();
        System.out.println(seniorDeveloper1.getSalary());

        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2],
                new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        //hrManager.addEmployee(2, juniorDeveloper2);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(1, midDeveloper2);
        hrManager.addEmployee(0, seniorDeveloper1);

        System.out.println(hrManager);
    }
}
