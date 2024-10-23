package collections;

public class Employee {

    private String name;
    private double salary;
    private Gender gender;
    private Deparment deparment;

    public Employee(String name, double salary, Gender gender, Deparment deparment) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.deparment = deparment;
    }


    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Deparment getDeparment() {
        return deparment;
    }





}