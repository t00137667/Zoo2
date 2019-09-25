public abstract class Animal {

    private int age, weightInPounds;
    private char gender;

    public Animal(int age, char gender, int weightInPounds){
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void eat(){
        System.out.println("I am eating...");
    }

    public void sleep(){
        System.out.println("I am sleeping...");
    }

    public abstract void move();

}
