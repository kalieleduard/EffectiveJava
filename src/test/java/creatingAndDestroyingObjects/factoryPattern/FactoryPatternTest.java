package creatingAndDestroyingObjects.factoryPattern;

import factoryPattern.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryPatternTest {

    @Test
    void givenAValidUserWhenCreateItShouldReturnOk() {
       final var expectedName = "George";
       final var expectedAge = 25;

       final var user = User.newInstance(expectedName, expectedAge);

        Assertions.assertDoesNotThrow(() -> User.newInstance(expectedName, expectedAge));

        Assertions.assertEquals(expectedName, user.getUsername());
        Assertions.assertEquals(expectedAge, user.getAge());
    }
}
