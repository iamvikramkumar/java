package collections;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        new ArrayListDemo4().f1();

    }

    private void f1() {
        Employee employee1=new Employee("Prudhvi",245845.222,Gender.MALE,Deparment.LEARNING);
        Employee employee2=new Employee("Praveen",24584.222,Gender.MALE,Deparment.DEVELOPMENT);
        Employee employee3=new Employee("Pavan",145845.222,Gender.MALE,Deparment.LEARNING);
        Employee employee4=new Employee("Kiran",232845.222,Gender.MALE,Deparment.TESTING);
        Employee employee5=new Employee("Tharun",445845.222,Gender.MALE,Deparment.DEVELOPMENT);

        ArrayList arrayList=new ArrayList();

        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            Employee emp=(Employee)arrayList.get(i);
            System.out.println("Employee Name :"+emp.getName());
            System.out.println("Employee Salary :"+emp.getSalary());
            System.out.println("Employee Gender :"+emp.getGender());
            System.out.println("Employee Department :"+emp.getDeparment());
            System.out.println("*****************************************************");
        }


    }
}