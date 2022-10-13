package bai_1.Animal.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck~~~~";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
