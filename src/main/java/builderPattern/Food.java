package builderPattern;

public class Food {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public Food(final Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public static final class Builder {
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder(final int servingSize,
                       final int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(final int value) {
            calories = value;
            return this;
        }

        public Builder fat(final int value) {
            fat = value;
            return this;
        }

        public Builder sodium(final int value) {
            sodium = value;
            return this;
        }

        public Builder carbohydrate(final int value) {
            carbohydrate = value;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }
}
