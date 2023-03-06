package creatingAndDestroyingObjects.singletonPattern;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonPattern.SingletonPattern;

class SingletonPatternTest {

    @Test
    void givenAValidSingletonWithEnumWhenCreatedWithShouldReturnOk() {
        final var instance = SingletonPattern.INSTANCE;
        instance.setDescription("MyName Is Kaliel");
        final var instance2 = SingletonPattern.KALIEL;

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        Assertions.assertEquals(instance.getDescription(), instance2.getDescription());
    }
}
