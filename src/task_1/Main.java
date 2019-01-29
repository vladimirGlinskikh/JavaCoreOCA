package task_1;

public class Main {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Darvin");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        System.out.println("--------------------------");
        Speakable pingvin = new Pingvin("Вилли");
        System.out.println(((Pingvin) pingvin).name);
        ((Pingvin) pingvin).eat();
        ((Pingvin) pingvin).sleep();
        ((Pingvin) pingvin).fly();
        pingvin.speak();
        System.out.println("---------------------------");
        Animal lev = new Lev("Марашал");
        System.out.println(((Lev) lev).name);
        lev.eat();
        ((Lev) lev).run();
        lev.sleep();
        ((Lev) lev).speak();
        System.out.println("--------------------------");
        Mammal lev1 = new Lev("КорольЛев");
        System.out.println(((Lev) lev1).name);
        lev1.run();
        lev1.speak();
    }
}
