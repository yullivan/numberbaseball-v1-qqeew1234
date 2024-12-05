//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.within;
//
//public class Citylist {
//
//    @Test
//    void 도시들() {
//        ArrayList<String> 한국도시들 = new ArrayList<>();
//        한국도시들.add("제주");
//        한국도시들.add("강릉");
//        한국도시들.add("울산");
//
//        ArrayList<String> 미국도시들 = new ArrayList<>();
//        미국도시들.add("디트로이트");
//        미국도시들.add("스프링필드");
//        미국도시들.add("볼티모어");
//
//        ArrayList<String> 독일도시들 = new ArrayList<>();
//        독일도시들.add("프랑크푸르트");
//        독일도시들.add("함부르크");
//        독일도시들.add("브레멘");
//
//        ArrayList<ArrayList<String>> 세계도시들 = new ArrayList<>();
//        세계도시들.add(한국도시들);
//        세계도시들.add(미국도시들);
//        세계도시들.add(독일도시들);
//
//        HashMap<String, ArrayList<String>> 세계도시들2 = new HashMap<>();
//        세계도시들2.put("한국", 한국도시들);
//        세계도시들2.put("미국", 미국도시들);
//        세계도시들2.put("독일", 독일도시들);
//
//        System.out.println(세계도시들2);
//
//        HashMap<String, String> 국가별이모지 = new HashMap<>();
//        국가별이모지.put("한국", "❤");
//        국가별이모지.put("미국", "⭐");
//        국가별이모지.put("독일", "🍺");
//
//        for (String 나라이름 : 세계도시들2.keySet()) {
//            String 이모지 = 국가별이모지.get(나라이름);
//            ArrayList<String> 도시들 = 세계도시들2.get(나라이름);
//            System.out.println(이모지 + 나라이름 + "" + 도시들);
//        }
//
////        for (Map.Entry<String, ArrayList<String>> entry : 세계도시들2.entrySet()) {
////            String emoji = "";
////            String 나라 = entry.getKey();
////            ArrayList<String> 그나라도시들 = entry.getValue();
////
////            if (나라.equals("한국")){
////                emoji = "❤";
////            }
////            if (나라.equals("미국")){
////                emoji = "⭐";
////            }
////            if (나라.equals("독일")){
////                emoji = "🍺";
////            }
////            System.out.println("나라: "+ 나라 + "도시들: "+ 그나라도시들);
////            for (String 도시 : 그나라도시들){
////                System.out.println(emoji + 도시);
////            }
////
////        }
//
//
//    }
//
//    @Test
//    void 도시데이터표현하기() {
//        HashMap<String, String> 경기도 = new HashMap<>();
//        경기도.put("도시명", "경기도");
//        경기도.put("인구", "13570000");
//        경기도.put("면적", "10171");
//
//        HashMap<String, String> 강원도 = new HashMap<>();
//        강원도.put("도시명", "강원도");
//        강원도.put("인구", "1537000");
//        강원도.put("면적", "20569");
//
//        HashMap<String, String> 충천북도 = new HashMap<>();
//        충천북도.put("도시명", "충천북도");
//        충천북도.put("인구", "1597000");
//        충천북도.put("면적", "7436");
//
//        ArrayList<HashMap<String, String>> 한국도시들 = new ArrayList<>();
//        한국도시들.add(경기도);
//        한국도시들.add(강원도);
//        한국도시들.add(충천북도);
//
//
//    }
//
//    @Test
//    void name() {
//        HashMap<String, String> product1 = new HashMap<>();
//        product1.put("상품명", "코멧 니트릴장갑 화이트");
//        product1.put("상품가격", "6540");
//        product1.put("카테고리", "주방용품");
//
//        HashMap<String, String> product2 = new HashMap<>();
//        product2.put("상품명", "라운드랩 1025 독도 로션, 400ml, 1개");
//        product2.put("상품가격", "16910");
//        product2.put("카테고리", "뷰티");
//
//        HashMap<String, String> product3 = new HashMap<>();
//        product3.put("상품명", "삼양 불닭볶음면 큰컵 105g, 16개");
//        product3.put("상품가격", "17110");
//        product3.put("카테고리", "식품");
//
//        ArrayList<HashMap<String, String>> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//        ArrayList<String> 미국의도시 = new ArrayList<>();
//        미국의도시.add("디트로이트");
//        미국의도시.add("스프링필드");
//        미국의도시.add("볼티모어");
//
//        ArrayList<String> 독일의도시 = new ArrayList<>();
//        독일의도시.add("프랑크푸르트");
//        독일의도시.add("함부르크");
//        독일의도시.add("브레멘");
//
//        ArrayList<String> 한국의도시 = new ArrayList<>();
//        한국의도시.add("제주");
//        한국의도시.add("강릉");
//        한국의도시.add("울산");
//
//
//        ArrayList<ArrayList<String>> 세계도시들 = new ArrayList<>();
//        세계도시들.add(한국의도시);
//        세계도시들.add(미국의도시);
//        세계도시들.add(독일의도시);
//
//
//    }
//
//    @Test
//    void myContainsTest() {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("박효신");
//        names.add("이지은");
//        names.add("하현우");
//
//        boolean 하현우존재여부 = myContains(names, "하현우");
//        boolean 잔나비존재여부 = myContains(names, "잔나비");
//
//        assertThat(하현우존재여부).isTrue();
//        assertThat(잔나비존재여부).isFalse();
//    }
//
//    boolean myContains(ArrayList<String> 이름목록, String 찾는이름) {
//        return true;
//    }
//
//    @Test
//    void getCommonElementsTest() {
//        List<Integer> firstList = List.of(1, 2, 3);
//        List<Integer> secondList = List.of(2, 3, 4);
//
//        List<Integer> commonElements = getCommonElements(firstList, secondList);
//
//        assertThat(commonElements)
//                .containsExactlyInAnyOrder(2, 3);
//    }
//    }
//