  

public class Animal0 extends Animal {
//    private Integer eyesCount;
    public Integer eyesCount;
    public Animal0(String name, Integer age, String vaccination, String color, String species, Owner owner,
            Integer legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
        this.eyesCount = 2;
    }
    public  Animal0() {
        this(null, null, null, null, null, null, null);
    }


    @Override
    public Integer getAge() {
        // TODO Auto-generated method stub
        return super.getAge();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // получить можно только чз супер???
        return super.getName()+" I'm animal0 ";
    }
    public Integer getEyesCount() {
        return eyesCount;
    }
}
