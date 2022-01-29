package Lesson5;

import static Lesson5.Employee.*;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Ivanov Ivanovich", "Developer", "Ivanov77@mail.com", "+7-373-373-273", 50000, 30);
        employees[1] = new Employee("Petr Petrov Petorovich", "Developer", "Petrov77@mail.com", "+7-373-373-127", 50000, 35);
        employees[2] = new Employee("Andrei Andreev Andreevich", "Senior developer", "Andreev77@mail.com", "+7-373-373-111", 300000, 40);
        employees[3] = new Employee("Mihail Mihailov Mihailovich", "Project manager", "Mihailov77@mail.com", "+7-373-373-222", 500000, 50);
        employees[4] = new Employee("Aleksei Alekseev Alekseevech", "System administrator", "Alekseev77@mail.com", "+7-373-373-333", 1000000, 100);
        clubOfFortyPlus(employees);

    }

    public static void clubOfFortyPlus(Employee[] employees){
        for (Employee employee : employees) {
            if(employee.getAge() > 40){
                printEmployeeInfo(employee);
            }
        }
    }
}
