public class EmployeeManagementTest {

    public static void main(String[] args) {

        EmployeeManagement manager =
                new EmployeeManagement(10);

        Employee e1 =
                new Employee(
                        101,
                        "Nohitha",
                        "Developer",
                        50000
                );

        Employee e2 =
                new Employee(
                        102,
                        "Priya",
                        "Tester",
                        45000
                );

        Employee e3 =
                new Employee(
                        103,
                        "Rahul",
                        "Manager",
                        70000
                );

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.displayEmployees();

        System.out.println(
                "\nSearching Employee ID 102:"
        );

        Employee found =
                manager.searchEmployee(102);

        if (found != null) {

            System.out.println(found);

        } else {

            System.out.println(
                    "Employee not found."
            );
        }

        System.out.println(
                "\nDeleting Employee ID 101"
        );

        manager.deleteEmployee(101);

        manager.displayEmployees();
    }
}