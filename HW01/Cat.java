

import java.util.Arrays;

public class Cat extends Animal implements Animel23Hunt, AnimeI21Run {

    public Cat(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    public Cat() {
        this(null, null, null);
        //TODO Auto-generated constructor stub
    }

    public Cat(String name) {
        super(name);
    }


    private void FIndFood() {
        System.out.println("Cat found food ");
    }

    private void FIndFood(int... args) {
        System.out.println("Cat found food, count = " + Arrays.toString(args));
    }

    private void WakeUp() {
        System.out.println("Cat woke up ");
    }

    private void Sleep() {
        System.out.println("Cat sleeps ");
    }

    private void Eat() {
        System.out.println("Cat ate ");
    }

    //    @Override
    public void Hunt(int... args) {
//        int[] args2 = args;
//        System.out.println("args2[] "+Arrays.toString(args2));
        WakeUp();
        FIndFood(args);
        Eat();
        Sleep();
    }


    public void setAge(Integer age) {
        //TODO ??
        super.setAge(age);
    }


    @Override
    public void run() {
        System.out.println(this.getName() + " is runnabol");
    }


}
