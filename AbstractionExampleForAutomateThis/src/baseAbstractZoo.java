abstract class baseAbstractZoo {

    public void eating(String animalName, String dietType){
        System.out.println(animalName +" are "+ dietType);
    }

    public void drinking(String animalName){
        if(animalName.equalsIgnoreCase("Tiger")) {
            System.out.println(animalName+" drinks water and milk");
        }else
            System.out.println(animalName+" drinks water");
    }

    public abstract void hunt();
    public abstract void climbTree();
    public abstract void swim();

}
