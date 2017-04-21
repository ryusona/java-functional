package stream;

import stream.model.Park;
import stream.service.ParkService;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class Streamex {
    public static void main(String[] args) {

        List<Park>list =  ParkService.makeListFromCSV("src\\Parks.csv");

//        //Sorting
//        Collections.sort(list,(x,y) ->
//                x.getParkKey().length() - y.getParkKey().length()); //파라미터 2개 들어가야 함(소팅할 것, 하는 방식)
//
//        //filtering
//        list.removeIf(x -> ! x.getCity().startsWith("B"));//국가가 US인 것 필터링하기
//
//        //Printing
//        list.forEach(x -> System.out.println(x));//x 프린팅 하기.
//        list.forEach(System.out::println); //이렇게도 적을 수 있음.
//        System.out.println(list.size());


        //Stream 사용 방식(중개연산 필요 없다. 종단연산만 있음 됨.)
//        long us = list.stream()
//                .sorted((x, y) ->
//                        x.getParkKey().compareTo(y.getParkKey()))
//                .filter(x -> ! x.getCity().startsWith("B"))
//                .count();//filter 는 false 인 것이 filtering 됨. compareTo는 글자대로 비교하는 것.
//        // startsWith 는 특정 문자로 시작하는 것 처리할 때 씀
//
//        System.out.println(us);



//        //parkAlias 에 정보 없는 곳을 "없음"이라고 바꿔서 데이터 출력하는 것 (mapping : 데이터 갯수는 같음, 각각 데이터들의 내용이 바뀜)
//
//        list.stream()
//                .map(x -> {
//                    String alias = x.getParkAlias();
//                    if (alias == null || alias.equals("")) {
//                        alias = "없음";
//                    }
//                    x.setParkAlias(alias); //x 에다가 새롭게 setParkAlias 를 짜주는 것.
//                    return  x;
//                })
//                .forEach(x -> System.out.println(x));


//        //City 에 있는 정보들을 모두 소문자로 바꾸기.(이 역시 mapping 사용)
//        list.stream()
//                .map(x -> {
//
//                    x.setCity(x.getCity().toLowerCase()); //city 에 변경된 정보 한 방에 넣기
//                    return x;
//                    })
//                .forEach(x -> System.out.println(x));

//        //City 에 있는 정보들을 출력될 때 세 글자로만 출력되도록 바꾸기 + state를 소문자로 바꾸기
//        list.stream()
//                .map(x -> {
//                    x.setCity(x.getCity().substring(0,3));
//                    return x;
//                })
//                .map(x -> {
//                    x.setState(x.getState().toLowerCase());
//                    return x;
//                })
//                .forEach(x -> System.out.println(x));

        //country 에서 US 면 미국, Mx면 멕시코, JP면 일본, CA면 캐나다, AU는 호주

//        list.stream()
//                .skip(10)
//                .limit(10)
//                .filter(x -> !x.getCountry().equals("US"))
//                .peek(System.out::println) // 일종의 로그 남기기
//                .map(x -> { x.setCountry(ParkService.resolveCountry(x.getCountry()));
//                    return x;
//                })
//                .map(log -> log.getCountry())
//                .forEach(System.out :: println);

//    }

        // 서비스 참조해서 영어이름값 한글로 매핑
//     list.stream()
//             .skip(10)
//             .limit(10)
//             .peek(System.out::println) // 일종의 로그 남기기
//             .map(x -> {
//                 x.setCountry(ParkService.resolveCountry(x.getCountry()));
//                 return x;
//             })

        OptionalDouble dd =
        list.stream()
                .mapToInt(x -> x.getParkName().length()  + x.getCity().length()
                                + x.getCountry().length() + x.getParkAlias().length()
                                + x.getState().length() + x.getParkKey().length())
                .peek(System.out::println)
                .average();

        if (dd.isPresent()) {
            System.out.println(dd.getAsDouble()); // 값을 double로 가져옴
        } else System.out.println("값이 없어요");

        // System.out.println(dd);

    }
}

