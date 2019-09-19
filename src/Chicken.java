public class Chicken extends Bird {

    public Chicken(int age, char gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    public void fly(){
        System.out.println("I cannot fly. I am flapping!");
    }

}
