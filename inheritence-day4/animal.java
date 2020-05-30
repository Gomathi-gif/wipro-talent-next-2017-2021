public class Animal {
public Animal() {
    System.out.println("A new animal has been created!");
}   
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");
}
public void fly(){
System.out.println("An animal fly..");
}
public class Bird  extends Animal {

public Bird() {
    super();
    System.out.println("A new bird has been created!");
}
public void sleep() {
    System.out.println("A bird sleeps...");
}
public void eats() {
    System.out.println("A bird eats...");
}
public void fly(){
System.out.println(" a bird fly..");

}
public class MainClass {

public static void main(String[] args) {
    Animal animal = new Animal();
    Bird bird = new Bird();

    System.out.println();
}

}