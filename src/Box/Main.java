package Box;

public class Main {
    public static void main(String[] args) {
        Fighter f1  = new Fighter("A", 30, 100, 100, 15);
        Fighter f2 = new Fighter("B",30,100,85,10);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
