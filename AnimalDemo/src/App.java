class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void play() {
        
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public String getName() {
        return "I'm a dog. My name is " + super.getName();
    }
    public void play() {
        System.out.println("I'm digging around");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void play() {
        System.out.println("I'm playing with a ball");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Animal a1 = new Animal("AA1");
        // System.out.println(a1.getName());
        // Animal a2 = new Dog("DD1");
        // System.out.println(a2.getName());
        // Dog a3 = new Animal("AA2");
        // System.out.println(a3.getName());

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("DD1");
        animals[1] = new Dog("DD2");
        animals[2] = new Cat("CC1");
        animals[3] = new Cat("CC2");
        animals[4] = new Dog("DD3");

        for(Animal i:animals) {
            i.play();
        }
    }
}
