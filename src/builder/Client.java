package builder;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        MealA a = new MealA();
        waiter.setMealBuilder(a);
        Meal mealA = waiter.construct();

        System.out.print("Meal A:");
        System.out.println(mealA.getFood()+" and "+mealA.getDrink());

        MealB b = new MealB();
        waiter.setMealBuilder(b);
        Meal mealB = waiter.construct();

        System.out.print("Meal B:");
        System.out.println(mealB.getFood()+" and "+mealB.getDrink());
    }
}
