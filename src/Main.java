public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(" Елизавета ", "Олейникова", " Сергеевна ", 1, 167653);
        employees[1] = new Employee(" Алексей ", "Калинин ", " Миронович ", 2, 467843);
        employees[2] = new Employee(" Екатерина ", "Ларина ", " Тимуровна ", 3, 145673);
        employees[3] = new Employee(" Иван ", "Данилов ", " Кириллович ", 4, 866566);
        employees[4] = new Employee(" Василиса ", "Орлова ", " Павловна ", 5, 256765);
        employees[5] = new Employee(" Тихон ", "Поляков ", " Георгиевич ", 2, 473532);
        employees[6] = new Employee(" Ольга ", "Сизова ", " Владимировна ", 1, 356467);
        employees[7] = new Employee(" Владимир ", "Сомов", " Михайлович ", 3, 653256);
        employees[8] = new Employee(" Арина ", "Чистякова ", " Никитична ", 1, 435613);
        employees[9] = new Employee(" Михаил ", "Щукин", " Матвеевич ", 3, 452564);
        System.out.println("месячная " + Methods.calculateSalaryByMonths(employees));
        Methods.printEmployees(employees);
        System.out.println("максимальная " + Methods.findMaxSalary(employees));
        Methods.printNames(employees);


    }


}
