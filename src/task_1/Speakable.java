package task_1;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speak!");
    }
}
