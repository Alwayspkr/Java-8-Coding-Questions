import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8CodingQuestions {
    public static void main(String[] args) {

        //Programm to Print max/min salary from given collections
        List<Employee> employeeList = new ArrayList<>();
        createEmployeeList(employeeList);

        Optional<Employee> highestSalary = employeeList.stream()
                                           .collect(Collectors.maxBy(Comparator
                                           .comparingDouble(Employee::getSalary)));
        System.out.println("Highest Salary:: "+highestSalary.get());

        Optional< Employee> lowestSalary = employeeList.stream()
                                            .collect(Collectors.minBy(Comparator
                                            .comparingDouble(Employee::getSalary)));
        System.out.println("Lowest Salary::"+ lowestSalary.get());

        Optional<Employee> secondHighest = employeeList.stream()
                                            .sorted(Comparator.comparingDouble(Employee::getSalary)
                                             .reversed()).skip(1).findFirst();
        System.out.println("Second Highest Salary:: "+secondHighest.get());
    }
    private static void createEmployeeList(List<Employee> employeeList){

        employeeList.add(new Employee(111,"Pawan",25,"yes","Developer", 2021,60000));
        employeeList.add(new Employee(112,"Ranjith",28,"no","Tester", 2019,65000));
        employeeList.add(new Employee(113,"Bharath",32,"yes","frontend", 2018,70000));
        employeeList.add(new Employee(114,"Manohar",35,"yes","Backend", 2021,66000));
        employeeList.add(new Employee(115,"Vamshi",32,"no","Manager", 2021,70000));
        employeeList.add(new Employee(116,"Naveen",18,"no","Database", 2021,80000));
        employeeList.add(new Employee(117,"Kumar",19,"no","Angular", 2017,69000));
        employeeList.add(new Employee(118,"Ajay",25,"yes","Spring", 2020,67000));
        employeeList.add(new Employee(119,"SriRam",25,"yes","Developer", 2020,90000));
        employeeList.add(new Employee(120,"Suresh",40,"yes","Developer", 2016,98542));
        employeeList.add(new Employee(121,"Mani",12,"yes","Developer", 2021,60000));

    }

}


class Employee{
    int id;
    String name;
    int age;
    String active;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String active, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", active='" + active + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}



