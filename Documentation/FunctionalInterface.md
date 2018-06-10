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
