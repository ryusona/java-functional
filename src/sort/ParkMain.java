package sort;

import  sort.park.Park;
import sort.park.Park_2;
import sort.service.CitySortSerive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class ParkMain {
    public static void main(String[] args) throws Exception { // 예외를 처리하지 않겠다

        try {
            FileReader fr = new FileReader("src\\Parks.csv");

            BufferedReader br = new BufferedReader(fr);

            List<Park> parkList = new ArrayList();

            String line = "";

            br.readLine();

            while ((line = br.readLine()) !=null) {

                String[] splitted = line.split(",");
                parkList.add( new Park(splitted[0], splitted[1], splitted[2],
                        splitted[3], splitted[4], splitted[5]));

            }

            CitySortSerive city = new CitySortSerive();

            List<Park> haveAliasParkNumber = city.afterSortList(parkList); // city값 소팅 불러오는거

            List<Park> haveAliasParkNumber_2 = city.afterSortList_2(parkList); // 글자수로 소팅해서 제외시킨거 불러 옴

            for (Park e : haveAliasParkNumber_2) {
                System.out.println(e);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Comparator c = new Comparator<Park>() { // MyComparator 라는 클래스 대신 사용// 익명 커페레터 라고도함
//            public int compare(Park o1, Park o2) {
//                String first = o1.getCountry().toUpperCase();
//                String second = o2.getCountry().toUpperCase();
//
//                return first.compareTo(second);
//            }
//        };
//        Collections.sort(parkList, c);

//        윗 줄들을 한 줄로 표현
//        Collections.sort(parkList, (o1, o2) -> o1.getCity().compareTo(o2.getCity()));

//        서비스 패키지로 빼서 하는법


    }
}
