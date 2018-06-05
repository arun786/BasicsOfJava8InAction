package chapter2;

/**
 * Created by Adwiti on 6/4/2018.
 */
public class WeightAndColorPrettyPredicate implements PrettyApplePredicate {
    @Override
    public String accept(Apple apple) {
        String characteristics = apple.getWeight() > 30 ? "Heavy" : "Light";
        return characteristics + " apple with " + apple.getColor() + " color";
    }
}
