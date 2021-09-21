package geekbrains.org;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Person[] person = new Person[5];

        person[0] = new Person("Petrov Ivan Petrovich", "Manager", "ivanov@mail.ru", 4355443, 35000, 45);
        person[1] = new Person("Radionov Vladimir Lvovich", "Manager", "ivanov@mail.ru", 4355443, 35000, 45);
        person[2] = new Person("Sidorov Roman Ivanovich", "Director", "sidorov@mail.ru", 5465545, 98000, 55);
        person[3] = new Person("Koch Vatalij Valentinovich", "Driver", "koch@mail.ru", 5475545, 25000, 35);
        person[4] = new Person("Orlova Olga Nikolaevna", "Accountant", "orlova@mail.ru", 5465745, 50000, 39);



        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40)
                System.out.println("ФИО " + person[i].getName()+ " " + "Должность " + person[i].getFunction() + " " + "Email "+ person[i].getEmail() + " " + "Телефон " + person[i].getPhone() + " " + "Зарплата " + person[i].getPay() + " " + "Возраст "+ person[i].getAge() + " " );
        }
    }
}

