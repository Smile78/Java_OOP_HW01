

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnimeI animal = new Animal("Slon1", 32, "true", "White",
                "Mammal", new Owner("Stas"), 4);
        AnimeI animal1 = new Animal("Black", "Bird", 2);


        System.out.println(animal.getAge());
        animal.setAge(3);
        System.out.println(animal.getAge());
        System.out.println(animal);

        Animal0 animal0 = new Animal0(null, null, null, null, null, null, null);
        animal0.getAge();
        System.out.println(animal0);

        Animal catJstAnimal = new Animal0();
        List<AnimeI> animals = new ArrayList<>();
        List<AnimeI> animals2 = new ArrayList<>();
        animals.add(new Dog(null, null, null));
        animals.add(new Cat(null, null, null));

        animals.add(catJstAnimal);
        animals.add(animal);
        animals.add(animal1);
        System.out.println(animals);


//        Animal barsik = new Cat(null,null,null);
//        AnimeI barsik = new Cat(null,null,null);
        Cat barsik = new Cat(null, null, null);
        barsik.Hunt(555, 22, 77);
        barsik.setName("Barsik");


        System.out.println("\n------------- CHECK IT OUT -------------");

//        barsik.flight();
        barsik.togo();
//        barsik.swim();


        animals2.add(new Cat("kity1"));
        animals2.add(new Dog("dog1"));
        animals2.add(new Duck("dk1"));
        animals2.add(new Swift("sw1"));

        if (!animals2.isEmpty()) {
            if (animals2.get(3) instanceof Swift) {
                ((Swift) animals2.get(3)).flight();
            }
        }


    }
}
