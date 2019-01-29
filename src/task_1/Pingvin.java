package task_1;

public class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят, прижавшись друг к другу!");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать!");
    }

    public void speak() {
        System.out.println("Пингвины не умеют петь, как соловьи!");
    }
}
