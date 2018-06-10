package chapter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Adwiti on 6/10/2018.
 */
public class ConsumerExplained {
    /**
     * Consumer is a functional interface which takes in a parameter and returns void
     */

    public static void main(String[] args) {
        List<Word> words = new ArrayList<>();
        words.add(new Word(1, "hope"));
        words.add(new Word(1, "great"));
        words.add(new Word(1, "ashoka"));
        words.add(new Word(1, "akbar"));

        Consumer<Word> c = a -> System.out.println(a);
        display(words, c);
    }

    public static void display(List<Word> words, Consumer<Word> c) {
        for (Word w : words) {
            c.accept(w);
        }
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Word {
    private int id;
    private String word;
}
