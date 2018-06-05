package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adwiti on 6/3/2018.
 */
public class AppleBuilder {

    public static List<Apple> AppleBuilder() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Green", 10));
        apples.add(new Apple("Green", 20));
        apples.add(new Apple("Green", 30));
        apples.add(new Apple("Green", 40));
        apples.add(new Apple("Green", 50));
        apples.add(new Apple("Green", 60));
        apples.add(new Apple("Red", 10));
        apples.add(new Apple("Red", 20));
        apples.add(new Apple("Red", 30));
        apples.add(new Apple("Red", 40));
        apples.add(new Apple("Red", 50));
        apples.add(new Apple("Red", 60));
        return apples;
    }
}
