public class Methods {
    public static Employee[] employees = new Employee[10];


    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees)
            System.out.println(employee);
    }
    public static int  calculateSalaryByMonths(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }

        }
        return sum;
    }
    public static Employee findMaxSalary(Employee[] employees) {
        Employee search = employees[0];
        int maxSalary =  employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee!= null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                search = employee;
            }
        }

        return search;
    }
    public Employee findMinSalary(Employee[] employees) {
        Employee search = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                search = employee;
            }
        }

        return search;
    }
    public int findAverageSalary() {
        int sum = 0;
        int average = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
            average = sum / employees.length;

        }
        return average;

    }
    public static void printNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee!= null){
            System.out.println(employee.getName());
            System.out.println(employee.getMiddleName());
            System.out.println(employee.getSurname());
        }}


    }



}

