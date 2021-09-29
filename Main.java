package geekbrains.org;

public class Main {

    public static void main(String[] args) {
	Cat [] cats = new Cat[5];
    cats [0] = new Cat("Vasya", 10);
    cats [1] = new Cat("Pushistik", 45);
    cats [2] = new Cat("Barsik", 15);
    cats [3] = new Cat("Masya", 20);
    cats [4] = new Cat("Murzik", 50);
    Plate plate = new Plate(80);
    plate.info();
    plate.addFood(50);
    for (Cat cat : cats)
        cat.eat(plate);
    plate.info();
    for (Cat cat : cats)
        cat.info();
    }

}
