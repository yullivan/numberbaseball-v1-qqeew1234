package numberbaseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.map;

public class MapTest {
    @Test
    void 오타수정() {
        Map<String, String> englishKorean = new HashMap<>();
        englishKorean.put("book", "책");
        englishKorean.put("apple", "사가ㅗ"); // 이 코드를 수정하지 마세요
        englishKorean.put("car", "자동차");


// 아래에 코드 한 줄 추가
        englishKorean.put("apple", "사과");


// 아래 테스트를 통과해야 합니다
        assertThat(englishKorean).containsEntry("apple", "사과");
    }
    // 문제: HashMap을 사용하여 다음 작업을 수행하세요:
// 1. 학생 이름(String)과 나이(Integer)를 저장하는 Map을 생성하세요
// 2. 3명의 학생 정보를 추가하세요
// 3. 특정 학생의 나이를 출력하세요
    @Test
    void studentAgeMap() {
     Map<String, Integer> 학생부 = new HashMap<>();
     학생부.put("학생일", 1);
     학생부.put("학생이", 2);
     학생부.put("학생삼", 3);
        System.out.println(학생부.get("학생일"));

// 문제: 다음 작업을 수행하는 메서드를 작성하세요:
// 1. 과일 이름(String)과 가격(Integer)을 저장하는 Map을 생성하세요
// 2. 모든 과일의 이름과 가격을 출력하세요
// 3. 특정 과일의 가격을 업데이트하세요
// 4. 가격이 특정 금액 이상인 과일들만 출력하세요


        // 여기에 코드 작성

    }

    @Test
    void nameList() {
        List<String> nameList = List.of(
                "권상윤",
                "김민성",
                "추민영",
                "김성락",
                "황승혁",
                "문성희",
                "문인혁",
                "박현지",
                "윤찬영",
                "윤태우",
                "권상윤",
                "이채현",
                "황효진",
                "권상윤",
                "황승혁",
                "박현지",
                "이호연",
                "전지예",
                "정해준",
                "문인혁",
                "김성락",
                "추민영",
                "허재",
                "황승혁",
                "황효진"
        );
// 아래에 코드 추가
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : nameList) {
         if (map.containsKey(name)){
             map.put(name, map.get(name)+1);
         }else {
             map.put(name,1);
         }
            System.out.println(map);

        }

// 아래 테스트를 통과해야 합니다
        assertThat(map).containsEntry("추민영", 2)
                .containsEntry("문성희", 1)
                .containsEntry("전지예", 1)
                .containsEntry("정해준", 1)
                .containsEntry("김성락", 2)
                .containsEntry("이호연", 1)
                .containsEntry("권상윤", 3)
                .containsEntry("황승혁", 3)
                .containsEntry("박현지", 2)
                .containsEntry("김민성", 1)
                .containsEntry("이채현", 1)
                .containsEntry("문인혁", 2)
                .containsEntry("황효진", 2)
                .containsEntry("윤찬영", 1)
                .containsEntry("윤태우", 1)
                .containsEntry("허재", 1);
    }

    @Test
    void fruitPriceMap() {
        HashMap<String, Integer> fruitlist = new HashMap<>();
        fruitlist.put("apple",110);
        fruitlist.put("melon",220);
        fruitlist.put("banana",330);


        for (Map.Entry<String, Integer> entry : fruitlist.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: "+ key + ", Value" + value);
        }
        // 여기에 코드 작성
        for (Map.Entry<String, Integer> entry : fruitlist.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value>200){
                System.out.println("Key: "+ key + ", Value" + value);
            }

        }
        Map<String, Integer> productStock = new HashMap<>();
        productStock.put("갤럭시 S24", 8);
        productStock.put("삼다수 2L", 20);
        productStock.put("칙촉 오리지널 6+2입 120g", 10);
        productStock.put("M4 맥북 프로", 5);

// 아래에 코드를 작성해 주세요
        ;
        productStock.put("갤럭시 S24", productStock.get("갤럭시 S24")-1);
        productStock.put("M4 맥북 프로", productStock.get("M4 맥북 프로")-1);

        // int count = 5;
        // count = count - 1;
// 🚫 productStock.put("갤럭시 S24", 7);
// 🚫 productStock.put("M4 맥북 프로", 4);


// 아래 테스트를 통과해야 합니다
        assertThat(productStock.get("갤럭시 S24")).isEqualTo(7);
        assertThat(productStock.get("M4 맥북 프로")).isEqualTo(4);

    }

    @Test
    void 교집합() {
        List<Integer> 정수1 = List.of(1, 2, 3);
        List<Integer> 정수2 = List.of(1, 2, 4);

        ArrayList<Integer> 교집합 = new ArrayList<>();

        for (Integer 아무거 : 정수1) {
            if (정수2.contains(아무거)){
                교집합.add(아무거);
            }
        }
    }
}
