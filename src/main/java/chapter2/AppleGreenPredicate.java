package chapter2;

/**
 * Created by Adwiti on 6/4/2018.
 */
public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "Green".equalsIgnoreCase(apple.getColor());
    }
}
