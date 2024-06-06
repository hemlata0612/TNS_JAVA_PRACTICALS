public class MainActivity {
    public static void main(String[] x) {
        // Creating an Employee object and calling its methods
        Emp e = new Emp("Hemlata", 21, "7859468791", "123 Elm Street", 50000.0, "Software Engineering");
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Phone Number: " + e.getPhoneNumber());
        System.out.println("Address: " + e.getAddress());
        emp.printSalary();
        System.out.println("Specialization: " + e.specialization);

        // Creating a Manager object and calling its methods
        Manager mgr = new Manager("Hir", 22, "0987654321", "456 Oak Avenue", 75000.0, "Human Resources");
        System.out.println("\nManager Details:");
        System.out.println("Name: " + mgr.getName());
        System.out.println("Age: " + mgr.getAge());
        System.out.println("Phone Number: " + mgr.getPhoneNumber());
        System.out.println("Address: " + mgr.getAddress());
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}