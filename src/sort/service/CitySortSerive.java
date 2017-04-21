package sort.service;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import sort.park.Park;
import sort.park.Park_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class CitySortSerive {
    public List afterSortList (List<Park> park){ // 씨티값으로 소팅 하는 부분

        Collections.sort(park, (o1, o2) -> o1.getState().compareTo(o2.getState()));
        List<Park> sortParkList = new ArrayList<>();
        sortParkList.addAll(park);

        return  sortParkList;
    }

    public List afterSortList_2 (List<Park> park){ // ParkName의 길이 수로 소팅 한 후에 국가가 US가 아닌걸 제거하고 return

        Collections.sort(park, (o1, o2) -> o1.getParkName().length() - o2.getParkName().length());
        park.removeIf(p -> !p.getCountry().equals("US")); // US가 아닌걸 리스트에서 지움
        List<Park> sortParkList = new ArrayList<>();
        sortParkList.addAll(park);

        return  sortParkList;
    }
}
