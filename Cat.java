package geekbrains.org;

public class Cat {
    private String name;
    private int appetite;
    private boolean isNotHungry;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        isNotHungry = false;
    }
    public void eat(Plate p){
        isNotHungry = p.decreaseFood(appetite);
        if (isNotHungry)
            System.out.println("Cat"+ " " + name + " " + "eat" + " " + appetite);
        else
            System.out.println("It's not enough Food");
    }
    public void info (){
        System.out.println(name + " " + ((isNotHungry)?"is full":"hungry"));
    }
}
