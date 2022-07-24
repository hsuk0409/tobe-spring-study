package earstone.efjava.item65;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaReflectionApiTest {

    @DisplayName("이펙티브 자바 아이템65 리플렉션 관련 코드 작성, 클래스 경로로 Class 얻기")
    @Test
    void reflectionTest1() {
        Class<?> teamClass;
        try {
            teamClass = Class.forName("earstone.efjava.item65.Team");
            System.out.println(teamClass);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("해당 클래스를 찾을 수 없습니다.");
        }

        Constructor<?> constructor;
        try {
            constructor = teamClass.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("해당 클래스에서 기본 생성자를 찾을 수 없습니다.");
        }

        Team team;
        try {
            team = (Team) constructor.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("클래스를 인스턴스화 할 수 없습니다.");
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("생성자에 접근할 수 없습니다.");
        } catch (InvocationTargetException e) {
            throw new IllegalStateException("생성자가 예외를 던졌습니다: " + e.getCause());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Team 클래스로 변환할 수 없습니다.");
        }

        System.out.println("name: " + team.getName());
    }

    @DisplayName("이펙티브 자바 아이템65 리플렉션 관련 코드 작성, 클래스 개체로 Class 얻기")
    @Test
    void reflectionTest2() {
        // 클래스 경로로 Class 개체 가져온다.
        Class<?> teamClass = Team.class;

        assertThat(teamClass).isNotNull();

    }

    private void fatalError(String message) {
        System.err.println(message);
        System.exit(1);
    }


}
