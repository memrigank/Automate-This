public class runZoo {

    public static void main(String[] args){
        cat cat = new cat();
        cat.animalDrinkWater();
        cat.animalEat();
        cat.animalRun();
        dog dog = new dog();
        dog.animalDrinkWater();
        dog.animalRun();
        dog.animalEat();
        elephant elephant = new elephant();
        elephant.climbTree();
        elephant.hunt();
        elephant.swim();
        elephant.drinking("Elephant");
        elephant.eating("Elephant", "Vegetarian");
        tiger tiger = new tiger();
        tiger.drinking("Tiger");
        tiger.eating("Tiger", "Carnivorous");
    }
}
