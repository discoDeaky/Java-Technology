package com.company;

/* Варіант 4
Створити АБСТРАКТНИЙ КЛАС Працівник фірми і підкласи Менеджер, Аналітик, Програміст, Тестувальник, Дизайнер.
Задати кількість відпрацьованих днів та заробітну ставку за день. Вивести зарплату кожного співробітника.
*/

abstract class Employee1{
    double days, rate;

    Employee1(double days, double rate){
        this.days = days;
        this.rate = rate;
    }

    double Salary (){
        return days * rate;
    }

    abstract void display();
}

class Manager1 extends Employee1{
    Manager1(double days, double rate) {
        super(days, rate);
    }
    void display (){
        System.out.printf("Manager`s salary is %s$\n", super.Salary());
    }
}

class Analyst1 extends Employee1{
    Analyst1(double days, double rate) {
        super(days, rate);
    }
    void display (){
        System.out.printf("Analyst`s salary is %s$\n", super.Salary());
    }
}

class Programmer1 extends Employee1{
    Programmer1(double days, double rate) {
        super(days, rate);
    }
    void display (){
        System.out.printf("Programmer`s salary is %s$\n", super.Salary());
    }
}

class Tester1 extends Employee1{
    Tester1(double days, double rate) {
        super(days, rate);
    }
    void display (){
        System.out.printf("Tester`s salary is %s$\n", super.Salary());
    }
}

class Designer1 extends Employee1{
    Designer1(double days, double rate) {
        super(days, rate);
    }
    void display (){
        System.out.printf("Designer`s salary is %s$\n", super.Salary());
    }
}

public class Lab4_2 {
    public static void main(String args[]){
        Manager1 m = new Manager1(25, 8.5);
        m.display();
        Analyst1 a = new Analyst1(10,9);
        a.display();
        Programmer1 p = new Programmer1(29,10);
        p.display();
        Tester1 t = new Tester1(28,9.5);
        t.display();
        Designer1 d = new Designer1(33,10);
        d.display();
    }
}
