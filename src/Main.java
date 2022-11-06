public class Main {


    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees)
            System.out.println(employee);
    }
    public static void printNames(Employee[] employees) {
        for (Employee employee : employees){
            System.out.println (employee.name);
            System.out.println(employee.middleName);
            System.out.println(employee.surname);
    }}

    public static int calculateSalaryByMonths(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        Employee search = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                search = employee;
            }
        }
        return search;

    }

    public static Employee findMinSalary(Employee[] employees) {
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

    public static int findAverageSalary(Employee[] employees) {
        int sum = 0;
        int average = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
            average = sum / employees.length;

        }
        return average;

    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees [0] = new Employee(" Елизавета ", "Олейникова", " Сергеевна ", 1, 167653);
        employees [1] = new Employee(" Алексей ", "Калинин ", " Миронович ", 2, 467843);
        employees [2] = new Employee(" Екатерина ", "Ларина ", " Тимуровна ", 3, 145673);
        employees [3] = new Employee(" Иван ", "Данилов ", " Кириллович ", 4, 866566);
        employees [4] = new Employee(" Василиса ", "Орлова ", " Павловна ", 5, 256765);
        employees [5] = new Employee(" Тихон ", "Поляков ", " Георгиевич ", 2, 473532);
        employees [6] = new Employee(" Ольга ", "Сизова ", " Владимировна ", 1, 356467);
        employees [7] = new Employee(" Владимир ", "Сомов", " Михайлович ", 3, 653256);
        employees [8] = new Employee(" Арина ", "Чистякова ", " Никитична ", 1, 435613);
        employees [9] = new Employee(" Михаил ", "Щукин", " Матвеевич ", 3, 452564);
        printEmployees(employees);
        System.out.println(" зп в месяц " + calculateSalaryByMonths(employees));
        System.out.println("максимальная запралата " + findMaxSalary(employees) );
        System.out.println("миниимальная запралата " + findMinSalary(employees) );
        System.out.println("средняя зп " + findAverageSalary(employees));
        printNames(employees);


    }



}
