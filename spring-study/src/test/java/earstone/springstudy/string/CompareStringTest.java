package earstone.springstudy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareStringTest {

    @DisplayName("같은 값의 두 문자열 변수는 == 비교해도 일치하다.")
    @Test
    void compareAddressForStringPool() {
        String str1 = "hi";
        String str2 = "hi";

        assertThat(str1 == str2).isTrue();
    }
}
