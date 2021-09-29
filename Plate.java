package geekbrains.org;

public class Plate {
    private int food;


    public Plate(int food){
        this.food = food;
    }
    public boolean decreaseFood(int n){
        if(n > food)
            return false;
        else
        food -= n;
        return true;
    }
    public void addFood (int food){
        this.food += food;
        System.out.println("Add Food" + food);
    }
    public void info() {
        System.out.println("plate" + food);
    }
}
