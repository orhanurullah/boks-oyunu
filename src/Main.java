public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Orhan", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Mehmet", 15, 105, 85, 20);

        Match match = new Match(f1, f2, 80, 110);

        match.run();
    }
}
