package builder;

public class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        // Steps
        mealBuilder.buildFood();
        mealBuilder.buildDrink();

        return mealBuilder.getMeal();
    }
}
