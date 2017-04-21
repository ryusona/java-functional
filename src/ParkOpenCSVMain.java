import com.opencsv.CSVReader;
import sort.park.Park;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class ParkOpenCSVMain { // OpenSCV 사용해서 소팅 하는 거
    public static void main(String args[]) {

        List<Park> parkList = new ArrayList();

        try {
            CSVReader reader = new CSVReader(new FileReader("src\\Parks.csv"));
            reader.readNext(); // 한줄 읽어줌

            String [] nextLine;
            while ((nextLine = reader.readNext()) != null) {

                parkList.add( new Park(nextLine[0], nextLine[1], nextLine[2],
                        nextLine[3], nextLine[4], nextLine[5]));
            }

            for (Park e : parkList) System.out.println(e);

            Collections.sort(parkList, (a, b) -> a.getState().compareTo(b.getState()));

//            Predicate<Park> p = new Predicate<Park>() { // boolean
//                @Override
//                public boolean test(Park park) {
//                    return  park.getParkAlias() == null || park.getParkAlias().equals("");
//                    // 참이면 true 거짓이면 false를 리턴값으로 줌
//                }
//            };
//            parkList.removeIf(p);
            // 위의 Predicate를 람다 사용하여 한줄로...

            parkList.removeIf(p -> p.getParkAlias() == null || p.getParkAlias().equals("")); // 해당하는 값이 없으면 그 리스트를 지움

            System.out.println("remove후 값");

            // for (Park e : parkList) System.out.println(e);
            parkList.forEach(e -> System.out.println(e)); // for문을 람다식으로 한줄로 만들어버렸음..

        } catch (IOException e) {
            e.printStackTrace();
        }


        //
    }
}
