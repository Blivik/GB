package geekbrains.org;

public class Dog extends Animal {
    static private int count = 0;


    public Dog(String name){
        super (name);
        count++;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }


    @Override
    public void run (int distance){
        int maxRunDistance = 500;
        if (distance > 0 && distance < maxRunDistance)
            System.out.println(name + "пробежал" + distance + "m");
        else
            System.out.println("Собака не может так далеко бегать");
    }


    @Override
    public void swim(int distance) {
            int maxSwimDistance = 10;
            if (distance > 0 && distance < maxSwimDistance)
                System.out.println(name + "проплыл" + distance + "m");
            else
                System.out.println("Собака не может так далеко плавать");
        }
    }



