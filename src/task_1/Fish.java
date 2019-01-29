package task_1;

abstract public class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spiat ribi.");
    }

    abstract void swim();
}
