package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    @Test
    void 비교테스트() {

        Ball computerBall = new Ball();
        computerBall.position = 1;
        computerBall.number = 1;
        Ball userBall = new Ball();
        userBall.position = 1;
        userBall.number = 1;

        String 비교결과 = userBall.matchStatus(computerBall);

        assertThat(비교결과).isEqualTo("Strike");
    }

    @Test
    void 비교테스트2() {

        Ball computerBall = new Ball();
        computerBall.position = 1;
        computerBall.number = 1;
        Ball userBall = new Ball();
        userBall.position = 3;
        userBall.number = 1;

        String 비교결과 = userBall.matchStatus(computerBall);

        assertThat(비교결과).isEqualTo("Ball");
    }

    @Test
    void 비교테스트3() {

        Ball computerBall = new Ball();
        computerBall.position = 1;
        computerBall.number = 1;
        Ball userBall = new Ball();
        userBall.position = 3;
        userBall.number = 2;

        String 비교결과 = userBall.matchStatus(computerBall);

        assertThat(비교결과).isEqualTo("Nothing");
    }
}
