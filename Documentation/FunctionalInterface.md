# Functional Interface

## Predicate
    
        package chapter3;
        
        import java.util.ArrayList;
        import java.util.List;
        import java.util.function.Predicate;
        
        /**
         * Created by Adwiti on 6/10/2018.
         */
        public class PredicateExplained {
            /**
             * predicate takes in a parameter and returns a boolean. Predicate is a functional interface
             */
        
            /**
             * Predicate is used for filtering, it has one abstract method test which takes in a parameter of any type
             * and returns true
             */
        
            private static List<String> fruits = new ArrayList<>();
        
            public static void main(String[] args) {
                fruits.add("oranges");
                fruits.add("apples");
                fruits.add("bananas");
                fruits.add("jack fruit");
                fruits.add("watermelon");
        
                /**
                 * I want to create a new list where the count of letters of fruits are less than 7
                 */
        
                List<String> fruitsLessThan7Characters = filter(f -> f.length() < 7);
                System.out.println(fruitsLessThan7Characters);
        
                List<String> fruitGreaterThan7Characters = filter(f -> f.length() > 7);
                System.out.println(fruitGreaterThan7Characters);
        
                List<String> fruitsEqualTo7Characters = filter(f -> f.length() == 7);
                System.out.println(fruitsEqualTo7Characters);
        
            }
        
        
            public static List<String> filter(Predicate<String> p) {
                List<String> filteredList = new ArrayList<>();
                fruits.forEach(f -> {
                    if (p.test(f)) {
                        filteredList.add(f);
                    }
                });
        
                return filteredList;
            }
        }


## BiPredicate

    BiPredicate is an interface which takes in two parameters and returns a boolean
    
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
