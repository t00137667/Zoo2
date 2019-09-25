public class Zoo {
    public static void main(String[] args) {
        //Animal animal1 = new Animal(2,'f',56);


        //animal1.eat();
        //animal1.sleep();
        //animal1.eat();

        Bird bird1 = new Bird(1,'m', 5);

        System.out.println("Bird:");
        bird1.eat();
        bird1.sleep();
        bird1.move();


        Fish fish = new Fish(5,'f', 130);

        System.out.println("\nFish");
        fish.eat();
        fish.sleep();
        fish.move();
        fish.swim();

        Sparrow sparrow = new Sparrow(2,'f',1);

        System.out.println("\nSparrow:");
        sparrow.move();
        sparrow.fly();

        Chicken chicken = new Chicken(3,'f',4);

        System.out.println("\nChicken:");
        chicken.move();
        chicken.fly();

        Animal sparrow2 = new Sparrow(2,'M',3);
        sparrow2.eat();
        sparrow2.move();
        sparrow2.sleep();

    }
}
