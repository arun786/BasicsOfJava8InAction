package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adwiti on 6/3/2018.
 */
public class AppleFilter {
    List<Apple> apples;

    public AppleFilter() {
        apples = AppleBuilder.AppleBuilder();
    }

    public List<Apple> filterGreenApple() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple :
                apples) {
            if (apple.getColor().equals("Green"))
                greenApples.add(apple);
        }
        return greenApples;
    }

    public List<Apple> filterApplesWeightGreaterThan20() {
        List<Apple> weightGreaterThan20 = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() >= 20) {
                weightGreaterThan20.add(apple);
            }
        }
        return weightGreaterThan20;
    }

    public List<Apple> filterAppleForPredicate(ApplePredicate predicate) {
        List<Apple> filteredApple = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                filteredApple.add(apple);
            }
        }
        return filteredApple;
    }

    public void displayColorAndWeight(PrettyApplePredicate prettyApplePredicate) {
        List<Apple> displayApples = new ArrayList<>();
        for (Apple apple : apples) {
            System.out.println(prettyApplePredicate.accept(apple));
        }
    }
}
