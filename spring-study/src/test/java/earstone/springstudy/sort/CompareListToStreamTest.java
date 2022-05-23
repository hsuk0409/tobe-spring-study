package earstone.springstudy.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CompareListToStreamTest {

    @DisplayName("100만까지 랜덤수를 list 활용하여 내림차순 정렬한다.")
    @Test
    void listSortTest() {
        //given
        List<Integer> list = new ArrayList<>();

        //when
        Random random = new Random();
        for (int i = 0; i < 1000000; ++i) {
            list.add(random.nextInt());
        }

        //then
        Collections.sort(list);
        System.out.println(list.get(0));
    }

    @DisplayName("100만까지 랜덤수를 stream 활용하여 내림차순 정렬한다.")
    @Test
    void streamSortTest() {
        //given
        List<Integer> list = new ArrayList<>();

        //when
        Random random = new Random();
        for (int i = 0; i < 1000000; ++i) {
            list.add(random.nextInt());
        }

        //then
        System.out.println(list.stream()
                .sorted(Comparator.comparing(dto -> dto))
                .collect(Collectors.toList()).get(0));
    }

}
