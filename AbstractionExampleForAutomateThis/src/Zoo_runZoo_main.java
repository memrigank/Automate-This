public class Zoo_runZoo_main {

    public static void main(String[] args){
        Zoo_cat cat = new Zoo_cat();
        cat.animalDrinkWater();
        cat.animalEat();
        cat.animalRun();
        Zoo_dog dog = new Zoo_dog();
        dog.animalDrinkWater();
        dog.animalRun();
        dog.animalEat();
        Zoo_elephant elephant = new Zoo_elephant();
        elephant.climbTree();
        elephant.hunt();
        elephant.swim();
        elephant.drinking("Elephant");
        elephant.eating("Elephant", "Vegetarian");
        Zoo_tiger tiger = new Zoo_tiger();
        tiger.drinking("Tiger");
        tiger.eating("Tiger", "Carnivorous");
    }
}
