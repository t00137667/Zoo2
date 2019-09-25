public class Bird extends Animal {


    public Bird(int age, char gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    @Override
    public void move() {
        System.out.println("The bird is flapping it's wings.");
    }
}
