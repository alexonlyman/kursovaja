import java.util.Objects;

public class Employee {
    public String name;
    public String surname;
    public String middleName;
    public int devision;
    public int salary;
    static int count = 0;
    public int id = 0;


    public Employee(String name, String surname, String middleName, int devision, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.devision = devision;
        this.salary = salary;
        id += count;
        count++;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDevision() {
        return devision;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDevision(int devision) {
        this.devision = devision;
    }

    public String toString() {
        return " Имя: " + name
                + " ,фамилия:" + surname
                + " ,Отчество: " + middleName
                + " ,отдел № : " + devision
                + " ,зарплата: " + salary
                + " ,персональный Id " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getDevision() == employee.getDevision() && getSalary() == employee.getSalary()
                && id == employee.id && Objects.equals(getName(), employee.getName())
                && Objects.equals(getSurname(), employee.getSurname())
                && Objects.equals(getMiddleName(), employee.getMiddleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getMiddleName(), getDevision(), getSalary(), id);
    }
}
