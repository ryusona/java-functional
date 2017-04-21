import java.util.*;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class InterfaceExample {

    public static void main(String args[]) { // 이름길이값순서로 소팅

        List<String> list = Arrays.asList("kim", "lee", "park", "choi", "ryu", "jin");
        // Collections.shuffle(list);

        Comparator c = new Comparator<String>() { // MyComparator 라는 클래스 대신 사용// 익명 커페레터 라고도함
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(list, c); // 첫번째는 정렬할 값(list), 두번째는 정렬시킬 방법(c)

        System.out.println(list);

    }
}
