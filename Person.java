package geekbrains.org;

public class Person {
    String name;
    String function;
    String email;
    int phone;
    int pay;
    int age;

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getPay() {
        return pay;
    }

    public int getAge() {
        return age;
    }

    public Person (String name, String function, String email, int phone, int pay, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    }

