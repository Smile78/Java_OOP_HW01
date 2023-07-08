

public class Dog extends Animal implements AnimeI21Run {

    public Dog(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    public Dog() {
        this(null, null, null);
        //TODO Auto-generated constructor stub
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is runnabol");
    }


}
