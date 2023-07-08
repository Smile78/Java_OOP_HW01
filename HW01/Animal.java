  

// inteliij idea

//public abstract class Animal {
public  class Animal implements  AnimeI {

    private String name;
    private Integer age;
    private String vaccination;

    private String color;
    private String species;
    private  Owner owner;
    private Integer legsCount;



    public Animal(String name, Integer age, String vaccination, String color,
                  String species,  Owner owner, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount);
    }


    public Animal(String name) {
        this(name, null, null, null,null,null,null);
    }


    public Integer getAge() {
        return age;
    }



    public  void  setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(  Owner owner) {
        this.owner = owner;
    }


    //пойдут все
    public void togo(){
        System.out.println(this.name+" идёт..");
    }


//    public void swim(){
//        System.out.println(this.name+" плывет..");
//    }
//    public void flight(){
//        System.out.println(this.name+" полетает..");
//    }
//


    @Override
    public String toString() {
        // TODO Auto-generated method stub
//        return String.format("Animal: {name = %s, owner = %s}", this.name, this.owner);
//        return String.format("Animal: {name = %s, owner = %s}",  name,  owner);
        return String.format("smAnimal: {name = %s}",  name );
    }
}