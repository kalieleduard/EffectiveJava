package creatingAndDestroyingObjects.builderPattern;

import builderPattern.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuilderPatternTest {

    @Test
    void givenAValidFoodWhenCreateItShouldReturnOk() {
        final var expectedServingSize = 250;
        final var expectedServings = 2;
        final var expectedCalories = 150;
        final var expectedCarbohydrate = 15;
        final var expectedFat = 0;
        final var expectedSodium = 0;

        final var food = new Food.Builder(expectedServingSize, expectedServings)
                .calories(150)
                .carbohydrate(15)
                .build();

        Assertions.assertNotNull(food);
        Assertions.assertEquals(expectedServingSize, food.getServingSize());
        Assertions.assertEquals(expectedServings, food.getServings());
        Assertions.assertEquals(expectedCalories, food.getCalories());
        Assertions.assertEquals(expectedCarbohydrate, food.getCarbohydrate());
        Assertions.assertEquals(expectedFat, food.getFat());
        Assertions.assertEquals(expectedSodium, food.getSodium());
    }
}
