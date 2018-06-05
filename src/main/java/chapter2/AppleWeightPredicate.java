package chapter2;

/**
 * Created by Adwiti on 6/4/2018.
 */
public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 30;
    }
}
