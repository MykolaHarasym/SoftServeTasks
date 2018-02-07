package Task4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Empoyees> list = new ArrayList<>();
        list.add(new EmployeesWithHourlyWage("Stive" , 15 ));
        list.add(new EmployeesWithHourlyWage("Mike" , 12 ));
        list.add(new EmployeesWithHourlyWage("Jon" , 11 ));
        list.add(new EmployeesWithHourlyWage("Vasyl" , 18 ));
        list.add(new EmployeesWithHourlyWage("Stepan" , 9 ));
        list.add(new EmployeeWithFixedPayment("Andre", 1500));
        list.add(new EmployeeWithFixedPayment("Halya", 1700));
        list.add(new EmployeeWithFixedPayment("Chester", 1900));
        list.add(new EmployeeWithFixedPayment("Olga", 500));
        list.add(new EmployeeWithFixedPayment("Vira", 2500));
//        for(int i = 0; i < 3; i ++){
//            System.out.println(list.get(i));
//        }

        for (int i = list.size() - 1; i > list.size() - 1 - 4; i --){
            System.out.println(list.get(i).getId());
        }
    }
}
