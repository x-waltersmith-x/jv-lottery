package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i <= 2; i++) {
            Ball randomBall = lottery.getRandomBall();

            System.out.println(randomBall.toString());
        }
    }
}
