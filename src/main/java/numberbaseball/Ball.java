package numberbaseball;

public class Ball {
    int position;
    int number;

    String matchStatus(Ball other) {
        if (other.number == number && other.position == position) {
            return "Strike";
        }

        // number가 일치하지 않는 경우
        // position이 일치하지 않는 경우
        // 둘 다 일치하지 않는 경우
        if (other.number == number) {
            return "Ball";
        }

        // number가 일치하지 않는 경우
        // 둘 다 일치하지 않는 경우
        return "Nothing";
    }
}
