package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Adwiti on 6/10/2018.
 */
public class PredicateAndBiPredicateExplained {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("");
        words.add("energy");
        words.add("entertain");
        words.add("hope");
        words.add("hobby");
        words.add("great");
        words.add("greatness");

        List<String> isEmpty = filterUsingPredicate(word -> !word.isEmpty(), words);
        System.out.println(isEmpty);

        /**
         * to check words starting with ho
         */
        List<String> wordsStartingWithHo = filterUsingBiPredicate((w, y) -> w.startsWith(y), words, "ho");
        System.out.println(wordsStartingWithHo);


    }

    public static List<String> filterUsingPredicate(Predicate<String> p, List<String> words) {
        List<String> filteredWords = new ArrayList<>();
        words.forEach(word -> {
            if (p.test(word)) {
                filteredWords.add(word);
            }
        });
        return filteredWords;
    }

    public static List<String> filterUsingBiPredicate(BiPredicate<String, String> bp, List<String> words, String prefix) {
        List<String> filteredWords = new ArrayList<>();
        words.forEach(word -> {
            if (bp.test(word, prefix)) {
                filteredWords.add(word);
            }
        });
        return filteredWords;
    }
}
