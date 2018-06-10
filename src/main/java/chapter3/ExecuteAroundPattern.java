package chapter3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor {
    public String process(BufferedReader br) throws IOException;
}

/**
 * Created by Adwiti on 6/9/2018.
 */
public class ExecuteAroundPattern {

    /**
     * Requirement
     * Read a file and display lines as per input
     */

    public static String processAFile(BufferedReaderProcessor p, File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource("abc.txt").getFile());

        String oneLine = processAFile((br) -> br.readLine(), file);
        System.out.println(oneLine);

        String twoLine = processAFile((br) -> br.readLine() + "\n" + br.readLine(), file);
        System.out.println(twoLine);
    }

}