public class Zoo_runOther {  //Example of creating an object for abstract class, which is not possible btw

    Zoo_baseAbstractZoo baseAbstractZoo= new Zoo_baseAbstractZoo() {
        @Override
        public void hunt() {

        }

        @Override
        public void climbTree() {

        }

        @Override
        public void swim() {

        }
    };

    Zoo_baseInterfaceZoo baseInterfaceZoo = new Zoo_baseInterfaceZoo() {
        @Override
        public void animalEat() {

        }

        @Override
        public void animalDrinkWater() {

        }

        @Override
        public void animalRun() {

        }
    };
}
