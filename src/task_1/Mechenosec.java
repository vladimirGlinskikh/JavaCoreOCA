package task_1;

public class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, она ест обычный корм!");
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    }
}
