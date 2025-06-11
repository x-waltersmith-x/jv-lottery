package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            Lottery lottery = new Lottery();
            Ball randomBall = lottery.getRandomBall();

            System.out.println(randomBall.toString());
        }
    }
}
