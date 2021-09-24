package geekbrains.org;

public class Cat extends Animal {
    static private int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }
    @Override
    public void run (int distance){
        int maxRunDistance = 200;
        if (distance > 0 && distance < maxRunDistance)
            System.out.println(name + "пробежал" + distance + "m");
        else
            System.out.println("Кот не может так далеко бегать");
    }
    @Override
    public void swim (int distance){
        System.out.println("Коты не умеют плавать");
    }
}

