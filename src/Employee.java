public class Employee {
    public String name;
    public String surname;
    public String middleName;
    public int devision;
    public int salary;
    static int count = 0;
    public int id;


    public Employee(String name, String surname, String middleName, int devision, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.devision = devision;
        this.salary = salary;
        id = count;
        count++;
    }




    public String toString() {
        return "Имя:" + name + ",фамилия:" + surname + ",Отчество:" + middleName + ",отдел №Э: " + devision + ",зарплата: " + salary + ",персональный Id " + id;}

        public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDevision() {
        return this.devision;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDevision(int devision) {
        this.devision = devision;
    }
}
