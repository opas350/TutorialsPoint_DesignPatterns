public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("\nTotal Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("\nTotal Cost: " + nonVegMeal.getCost());
	}
}
