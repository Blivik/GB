package geekbrains.org;

public class Main {

    public static void main(String[] args) {


        Animal[] animals = { new Cat ("Barsik"),
        new Cat("Pushistik"),
        new Cat("Vasya"),
        new Dog("Bobik"),
        new Dog("Sharik"),
        new Dog("Tuzik")

        };
        System.out.println("Всего животных"+ " " + Animal.getCount() + " " + "Из них собак"+ " " + Dog.getCount() + " " + "Кошек"+ " " + Cat.getCount() );


        for (Animal animal : animals){
            animal.run(150);
            animal.swim(11);

        }

        }


    }



