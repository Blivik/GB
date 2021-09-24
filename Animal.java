package geekbrains.org;

public abstract class Animal {
    static private int count = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        count ++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }
    public abstract void run (int distance);

    public abstract void swim (int distance);

}
