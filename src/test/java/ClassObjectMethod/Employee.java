package ClassObjectMethod;

public class Employee {
    // By creating our own constructor we could enforce our own logic
    // to create an object.
    // Java always chooses the closest initialization when calling a variable with same name.
    String name;
    String department;
    int yearsOfExperience;
    String title;
    // this keyword
    // this means the current class. And usually used to call instance variable of the class.
    public Employee(String name, String department, int yearsOfExperience, String title){
        this.name = name; // Initializing the instance variable with a value that comes from the parameters.
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
    }

    public Employee(String empName,String departmentName, int experience){
        name = empName;
        department = departmentName;
        yearsOfExperience = experience;
    }
    // %99 of the time a constructor is used for initializing the instance variables in the class.

    // An HR should also be able to register an employee without years of experience.
    public Employee(String empName, String departmentName){
        name = empName;
        department = departmentName;
    }






    public static void main(String[] args) {
        Employee emp1 = new Employee("Dave","IT", 4);
        System.out.println(emp1.name);
        Employee emp2 = new Employee("Mauro","Finance");
        System.out.println("Department name of employee 2 is " + emp2.department);
        System.out.println("Name of the employee 1 is "+ emp1.name);



    }


}