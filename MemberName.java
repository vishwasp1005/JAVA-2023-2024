// 6(3)  Create a class named 'Member' having the following members:
// 1. Name
// 2. Age
// 3. Phone number
// 4. Address
// 5. Salary
// It also has a method named 'printSalary' which prints the salary 
// of the members.
// Two classes 'Employee' and Manager' inherits the 'Member' class. 
// The 'Employee' and 'Manager' classes have data members 
// 'specialization' and 'department' respectively. Now assign name, 
// age, phone number address and salary to an employee and a manager 
// by making an object of both of these classes and print the same 
// along with specialization and department respectively.


public class MemberName {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 30, "1234567890", "123 Main St", "50000", "Software Development");
        e1.printDetails();

        Manager m1 = new Manager("Alice", 40, "9876543210", "456 Park Ave", "80000", "Operations");
        m1.printDetails();
    }
}

class Member{
    String Name;
    int Age;
    String PhoneNumber;
    String Address;
    String Salary;

    public Member(String Name,int Age,String PhoneNumber,String Address,String Salary){
        this.Name = Name;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }

    public void printSalary(){
        System.out.println("Salary: "+ Salary);
    }
}

class Employee extends Member{
    String specialization;
    public Employee(String Name,int Age,String PhoneNumber,String Address,String Salary,String specialization){
        super(Name, Age, PhoneNumber, Address, Salary);
        this.specialization = specialization;
    }
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        printSalary(); // Calls inherited method to print salary
        System.out.println("Specialization: " + specialization);
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("");
    }
}

class Manager extends Member{
    String department;
    public Manager(String Name,int Age,String PhoneNumber,String Address,String Salary,String department){
        super(Name, Age, PhoneNumber, Address, Salary);
        this.department = department;
    }
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        printSalary(); // Calls inherited method to print salary
        System.out.println("department: " + department);
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("");
    }
}