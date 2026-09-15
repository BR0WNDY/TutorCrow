package OOP.L1_IntroOOP;

public class Dog {
    String name;
    int age;
    //variables in a class are called field or attribute
    boolean isHealthy;
    // contrutor = functions to make an objects from a class (to use a template)
    public Dog(String name, int age, boolean isHealthy){
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
    }
}
