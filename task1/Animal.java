package task1;

// Default-метод
public interface Animal {
    String move();
    default String sleep() {
        return ("спит");
    }
}
