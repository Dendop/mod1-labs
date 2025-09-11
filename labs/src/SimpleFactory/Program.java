package SimpleFactory;

public class Program {

    public static void main(String[] args) {
        Meal meal1 = MealFactory.getMeal("pizza");

//        Meal meal2 = MealFactory.getMeal("cheese");

        Meal meal3 = MealFactory.getMeal("noodles");

        meal1.serve();
        meal3.serve();
    }

}
