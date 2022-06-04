import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Elephant elephant = new Elephant();
        
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(bird);
        animalList.add(dog);
        animalList.add(elephant);

        for (Animal animal: animalList
             ) {
            animal.move();
            animal.makeNoise();
            animal.eat("Pumpkin");
        }
    }
}
