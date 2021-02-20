package com.company;

/* Варіант 4
Створити СУПЕРКЛАС Працівник фірми і підкласи Менеджер, Аналітик, Програміст, Тестувальник, Дизайнер.
Задати кількість відпрацьованих днів та заробітну ставку за день. Вивести зарплату кожного співробітника.
*/

class Employee{
    double days, rate;

    public Employee(double days, double rate){
        this.days = days;
        this.rate = rate;
    }

    public double Salary (){
        return days * rate;
    }
}

class Manager extends Employee{
    public Manager(double days, double rate) {
        super(days, rate);
    }
    public void display (){
        System.out.printf("Manager`s salary is %s$\n", super.Salary());
    }
}

class Analyst extends Employee{
    public Analyst(double days, double rate) {
        super(days, rate);
    }
    public void display (){
        System.out.printf("Analyst`s salary is %s$\n", super.Salary());
    }
}

class Programmer extends Employee{
    public Programmer(double days, double rate) {
        super(days, rate);
    }
    public void display (){
        System.out.printf("Programmer`s salary is %s$\n", super.Salary());
    }
}

class Tester extends Employee{
    public Tester(double days, double rate) {
        super(days, rate);
    }
    public void display (){
        System.out.printf("Tester`s salary is %s$\n", super.Salary());
    }
}

class Designer extends Employee{
    public Designer(double days, double rate) {
        super(days, rate);
    }
    public void display (){
        System.out.printf("Designer`s salary is %s$\n", super.Salary());
    }
}

public class Lab4_1 {
    public static void main(String args[]){
        Manager m = new Manager(25, 8.5);
        m.display();
        Analyst a = new Analyst(10,9);
        a.display();
        Programmer p = new Programmer(29,10);
        p.display();
        Tester t = new Tester(28,9.5);
        t.display();
        Designer d = new Designer(33,10);
        d.display();
    }
}
