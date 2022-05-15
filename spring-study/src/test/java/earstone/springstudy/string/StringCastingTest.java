package earstone.springstudy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCastingTest {

    @DisplayName("올바르게 문자열 캐스팅 한다.")
    @Test
    void stringTest() {
        //given
        Map<String, Object> map = new HashMap<>();
        map.put("noObj", 10);

        //when
        System.out.println(map.get("noObj"));
        String numObjStr = (String) map.get("noObj");

        //then
        assertThat(numObjStr).isEqualTo("10");
    }
}
