package task_1;

public class Lev extends Mammal {

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Лев хищник, он любит мясо!");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня, лев спит!");
    }

    @Override
    void run() {
        System.out.println("Лев, это не самая быстрая кошка!");
    }

    @Override
    public void speak() {
        System.out.println("РРРРР. Рычит лев.");
    }
}
