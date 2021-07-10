package BoxingMatchProgram;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Marry", 15, 100, 90, 30);
        Fighter fighter2 = new Fighter("Jane", 10, 95, 100, 40);
        Ring ring = new Ring(fighter1,fighter2, 90, 100);
        ring.run();
    }
}
