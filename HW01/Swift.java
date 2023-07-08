

public class Swift extends Animal implements AnimeI24Flight {

    public Swift(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    public Swift() {
        this(null, null, null);
        //TODO Auto-generated constructor stub
    }

    public Swift(String name) {
        super(name);
    }

    @Override
    public void flight() {
        System.out.println(this.getName() + " letitobol..");
    }

}
