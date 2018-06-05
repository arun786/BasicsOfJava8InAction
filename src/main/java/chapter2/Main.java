package chapter2;

import java.util.List;

/**
 * Created by Adwiti on 6/3/2018.
 */
public class Main {
    public static void main(String[] args) {
        AppleFilter appleFilter = new AppleFilter();
        List<Apple> greenApples = appleFilter.filterGreenApple();
        System.out.println(greenApples);

        System.out.println("---------------");
        List<Apple> applesWeightGreaterThan20 = appleFilter.filterApplesWeightGreaterThan20();
        System.out.println(applesWeightGreaterThan20);

        ApplePredicate applePredicate = new AppleGreenPredicate();
        List<Apple> applesWithGreenColor = appleFilter.filterAppleForPredicate(applePredicate);
        System.out.println("================");
        System.out.println(applesWithGreenColor);

        ApplePredicate a20AppleP = new AppleWeightPredicate();
        List<Apple> a20ApplePredicate = appleFilter.filterAppleForPredicate(a20AppleP);
        System.out.println("======================");
        System.out.println(a20ApplePredicate);

        System.out.println("+++++++++++++++++++++++");
        PrettyApplePredicate prettyApplePredicate = new WeightAndColorPrettyPredicate();
        appleFilter.displayColorAndWeight(prettyApplePredicate);

        System.out.println("#####################");
        //using lambda expression
        appleFilter.displayColorAndWeight((apple) -> apple.getColor() + ":" + apple.getWeight());

        List<Apple> apples = appleFilter.filterAppleForPredicate((apple -> apple.getColor().equalsIgnoreCase("Red")));
        System.out.println("&&&&&&&&&&&&&");
        System.out.println(apples);
        System.out.println("((((()))))");
        System.out.println(appleFilter.filterAppleForPredicate(apple -> apple.getWeight() > 50));
        System.out.println("*********");
        System.out.println(appleFilter.filterAppleForPredicate(apple -> apple.getColor().equalsIgnoreCase("Green") && apple.getWeight() > 40));

    }
}
