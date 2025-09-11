package SimpleFactory;

public class MealFactory {
    public static Meal getMeal(String type){
        switch (type.toLowerCase()){
            case "pizza":
                return new Italian();
            case "noodles":
                return new Chinese();
            default:
                throw new IllegalArgumentException("Invalid food type");
        }
    }
}
