

public class Duck extends Animal implements AnimeI24Flight, AnimeI22Swim {

    public Duck(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    public Duck() {
        this(null, null, null);
        //TODO Auto-generated constructor stub
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void flight() {
        System.out.println(this.getName() + " letitobol..");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " swimobl..");
    }
}
