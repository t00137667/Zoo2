public class Fish extends Animal {
    public Fish(int age, char gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
    public void swim(){
        System.out.println("I am swiming...");
    }

    @Override
    public void move() {
        System.out.println("The fish is wiggling.");
    }
}
