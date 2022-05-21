package earstone.efjava.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.ServiceLoader;

class HelloServiceTest {

    @DisplayName("서비스 로더를 사용하여 인터페이스 구현체를 모두 가져온다.")
    @Test
    void serviceLoaderTest() {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);

        Optional<HelloService> helloServiceOptional = loader.findFirst();

        helloServiceOptional
                .ifPresent(service -> System.out.println("Service:: " + service.hello()));

        HelloService helloService = new KoreanHelloService();
        System.out.println(helloService.hello());
    }

}