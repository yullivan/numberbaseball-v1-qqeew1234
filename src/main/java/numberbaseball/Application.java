package numberbaseball;

public class Application {
    public static void main(String[] args) {
        Ball computerball = new Ball();
        computerball.number = 7;
        computerball.position = 1;

        Ball userBall = new Ball();
        userBall.position = 1;
        userBall.number = 7;

        if (computerball.position == userBall.position && computerball.number == userBall.number)
        {
            System.out.println("스트라이크");
        }

    }
}
