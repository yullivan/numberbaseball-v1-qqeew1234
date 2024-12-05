//package numberbaseball;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Stream;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class ListTest {
//    @Test
//    void name() {
//        List<String> names = List.of("윤찬영",
//                "정해준",
//                "권상윤",
//                "문인혁",
//                "허재",
//                "이호연",
//                "윤태우",
//                "김성락",
//                "전지예",
//                "황승혁",
//                "이채현",
//                "황효진",
//                "김민성",
//                "박현지",
//                "문성희",
//                "추민영");
//
//        ArrayList<String> 그룹1 = new ArrayList<>();
//        그룹1.add(names.get(0));
//        그룹1.add(names.get(1));
//        그룹1.add(names.get(2));
//        그룹1.add(names.get(3));
//
//        ArrayList<String> 그룹2 = new ArrayList<>();
//        그룹2.add(names.get(4));
//        그룹2.add(names.get(5));
//        그룹2.add(names.get(6));
//        그룹2.add(names.get(7));
//
//        ArrayList<String> 그룹3 = new ArrayList<>();
//        그룹3.add(names.get(8));
//        그룹3.add(names.get(9));
//        그룹3.add(names.get(10));
//        그룹3.add(names.get(11));
//
//        ArrayList<String> 그룹4 = new ArrayList<>();
//        그룹4.add(names.get(12));
//        그룹4.add(names.get(13));
//        그룹4.add(names.get(14));
//        그룹4.add(names.get(15));
//
//        ArrayList<ArrayList<String>> 그룹들 = new ArrayList<>();
//        그룹들.add(그룹1);
//        그룹들.add(그룹2);
//        그룹들.add(그룹3);
//        그룹들.add(그룹4);
//
//
//        System.out.println(그룹들);
//
//    }
//
//    @Test
//    void name2() {
//        List<String> names = List.of("윤찬영",
//                "정해준",
//                "권상윤",
//                "문인혁",
//                "허재",
//                "이호연",
//                "윤태우",
//                "김성락",
//                "전지예",
//                "황승혁",
//                "이채현",
//                "황효진",
//                "김민성",
//                "박현지",
//                "문성희",
//                "추민영");
//
//
//        ArrayList<ArrayList<String>> teams = new ArrayList<>();
//        teams.add(new ArrayList<>());
//        teams.add(new ArrayList<>());
//        teams.add(new ArrayList<>());
//        teams.add(new ArrayList<>());
//        // [ [ ], [ ], [ ], [ ] ]
//
//        for (int i = 0; i < 4; i++) {
//            ArrayList<String> team = new ArrayList<>();
//            teams.add(team);
//        }
//
//        int teamNumber = 0;
//        for (String name : names) {
//            ArrayList<String> team = teams.get(teamNumber);
//            team.add(name);
//
//            if (team.size() == 4) {
//                teamNumber = teamNumber + 1;
//            }
//        }
//        System.out.println(teams);
//    }
//
//    @Test
//    void 필터_테스트_40보다_작은_수() {
//        List<Integer> scores = List.of(100, 60, 35, 70, 38, 80);
//
//        List<Integer> scoresBelow40 = scores.stream()
//                .filter(n -> {
//
//                })
//                .toList();
//
//        assertThat(scoresBelow40).isEqualTo(List.of(35, 38));
//
//
//    }
//
//    @Test
//    void 필터_테스트_짝수() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> evenNumbers = numbers.stream()
//                .filter((정수) -> {
//                    if (정수 % 2 == 0) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }).toList();
//
//        assertThat(evenNumbers).isEqualTo(List.of(2, 4, 6, 8, 10));
//    }
//
//    @Test
//    void 필터_테스트_길이_3_아닌_이름() {
//        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");
//
//        List<String> filteredNames = names.stream()
//                .filter((n) -> {
//                    if (n.length() != 3)
//                })
//                        .toList();
//
//                assertThat(filteredNames).isEqualTo(List.of("왕건", "박새로이", "이도"));
//    }
//
//    @Test
//    void 필터_테스트_이씨_이름() {
//        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");
//
//        List<String> filteredNames = names.stream()
//                .filter((n) -> {
//                    if ()
//                })
//                        .toList();
//
//                assertThat(filteredNames).isEqualTo(List.of("이성계", "이방원", "이도"));
//    }
//
//}
//
