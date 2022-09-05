import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList(Arrays.asList( new Cat("Sonic", 1), new WildCat("",4),
                                                                 new Dog("Bim", 5), new WildDog("", 2),
                                                                 new Pig("Popo", 2), new WildHog("")));

        for (Animal animal : animals) {
            animal.voice();
        }

    }
}
