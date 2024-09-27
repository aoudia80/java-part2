package learn_string;

public class Employee {
    String name;
    int salary;
    int id;
    public void getPaid(){
        System.out.println(name+ " gets paid "+ salary);
    }
    public void duty(){
        System.out.println("because he is a doctor");
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.id=1;
        employee.name="selyan";
        employee.salary=250000;
        employee.getPaid();
        employee.duty();
    }
}
